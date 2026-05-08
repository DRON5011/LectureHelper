from rest_framework.viewsets import ModelViewSet
from rest_framework.permissions import IsAuthenticated
from .permissions import IsTeacher
from .models import Lecture
from .serializers import LectureSerializer

class LectureViewSet(ModelViewSet):
    serializer_class = LectureSerializer
    permission_classes = [IsAuthenticated]

    def get_queryset(self):
        user = self.request.user

        if user.role == 'teacher':
            return Lecture.objects.filter(teacher=user)

        return Lecture.objects.filter(students=user)

    def get_permissions(self):
        if self.action in ['create', 'update', 'partial_update', 'destroy']:
            return [IsAuthenticated(), IsTeacher()]
        return [IsAuthenticated()]

    def perform_create(self, serializer):
        serializer.save(teacher=self.request.user)