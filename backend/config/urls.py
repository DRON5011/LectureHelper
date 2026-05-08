from django.contrib import admin
from django.urls import path, include
from .token import MyTokenObtainPairView
from .views import PasswordResetView, PasswordResetConfirmView
from rest_framework_simplejwt.views import TokenRefreshView
from apps.users.token import MyTokenObtainPairView


urlpatterns += [
    path('admin/', admin.site.urls),
    path('login/', MyTokenObtainPairView.as_view()),
    path('api/users/', include('apps.users.urls')),
    path('verify-email/<uidb64>/<token>/', VerifyEmailView.as_view()),
    path('password-reset/', PasswordResetView.as_view()),
    path('password-reset-confirm/<uid>/<token>/', PasswordResetConfirmView.as_view()),
    # 🔐 JWT
    path('api/token/', MyTokenObtainPairView.as_view()),
    path('api/token/refresh/', TokenRefreshView.as_view()),
]