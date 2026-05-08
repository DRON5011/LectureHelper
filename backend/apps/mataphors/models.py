from django.db import models
from apps.lectures.models import Lecture
from apps.users.models import User

class Metaphor(models.Model):
    short_name = models.TextField()
    start_time = models.TimeField()
    end_time = models.TimeField()
    teacher = models.ForeignKey('Teachers.fio', on_delete=models.CASCADE)
    lecture = models.ForeignKey('Lections.lection_name', on_delete=models.CASCADE)