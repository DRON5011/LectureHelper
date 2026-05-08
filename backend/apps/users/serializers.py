from rest_framework import serializers
from .models import User
from django.core.mail import send_mail
from django.conf import settings
from django.contrib.auth.tokens import default_token_generator
from django.utils.http import urlsafe_base64_encode
from django.utils.encoding import force_bytes
from django.contrib.auth import get_user_model

User = get_user_model()

class RegisterSerializer(serializers.ModelSerializer):
    password = serializers.CharField(write_only=True)

    class Meta:
        model = User
        fields = ['username', 'email', 'password', 'role']

    def create(self, validated_data):
        user = User.objects.create_user(
            username=validated_data['username'],
            email=validated_data['email'],
            password=validated_data['password'],
            role=validated_data['role'],
            is_active=False
        )

        self.send_verification_email(user)
        return user

    def send_verification_email(self, user):
        uid = urlsafe_base64_encode(force_bytes(user.pk))
        token = default_token_generator.make_token(user)

        verification_link = f"http://localhost:8000/api/verify-email/{uid}/{token}/"

        send_mail(
            subject="Подтверждение email",
            message=f"Перейдите по ссылке: {verification_link}",
            from_email=settings.DEFAULT_FROM_EMAIL,
            recipient_list=[user.email],
        )

class PasswordResetSerializer(serializers.Serializer):
    email = serializers.EmailField()

    def validate(self, attrs):
        self.user = User.objects.filter(email=attrs['email']).first()
        if not self.user:
            raise serializers.ValidationError("User with this email not found")
        return attrs

    def save(self):
        user = self.user

        uid = urlsafe_base64_encode(force_bytes(user.pk))
        token = default_token_generator.make_token(user)

        reset_link = f"http://localhost:8000/api/password-reset-confirm/{uid}/{token}/"

        send_mail(
            subject="Сброс пароля",
            message=f"Перейдите по ссылке: {reset_link}",
            from_email=settings.DEFAULT_FROM_EMAIL,
            recipient_list=[user.email],
        )


class PasswordResetConfirmSerializer(serializers.Serializer):
    uid = serializers.CharField()
    token = serializers.CharField()
    new_password = serializers.CharField(write_only=True)

    def validate(self, attrs):
        try:
            uid = urlsafe_base64_decode(attrs['uid']).decode()
            self.user = User.objects.get(pk=uid)
        except:
            raise serializers.ValidationError("Invalid UID")

        if not default_token_generator.check_token(self.user, attrs['token']):
            raise serializers.ValidationError("Invalid or expired token")

        return attrs

    def save(self):
        self.user.set_password(self.validated_data['new_password'])
        self.user.save()
