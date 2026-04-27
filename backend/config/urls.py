from django.contrib import admin
from django.urls import path, include

from rest_framework_simplejwt.views import TokenRefreshView
from apps.users.token import MyTokenObtainPairView


urlpatterns = [
    path('admin/', admin.site.urls),

    path('api/users/', include('apps.users.urls')),

    # 🔐 JWT
    path('api/token/', MyTokenObtainPairView.as_view()),
    path('api/token/refresh/', TokenRefreshView.as_view()),
]