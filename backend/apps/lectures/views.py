from rest_framework import viewsets
from .models import Lecture
from .serializers import LectureSerializer
from .permissions import IsTeacher

class LectureViewSet(viewsets.ModelViewSet):
    queryset = Lecture.objects.all()
    serializer_class = LectureSerializer

    def get_permissions(self):
        if self.request.method in ['POST', 'PUT', 'PATCH', 'DELETE']:
            return [IsTeacher()]
        return []