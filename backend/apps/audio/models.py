from django.db import models
from apps.lectures.models import Lecture

class Audio(models.Model):
    file = models.FileField(upload_to='audio/')
    lecture = models.ForeignKey(Lecture, on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)