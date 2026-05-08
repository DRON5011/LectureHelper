from django.db import models
from apps.lectures.models import Lecture
from apps.users.models import User

class ProblemPoint(models.Model):
    short_name = models.TextField()
    desc = models.TextField()
    student = models.ForeignKey('Students.fio', on_delete=models.CASCADE)
    lecture = models.ForeignKey('Lections.lection_name', on_delete=models.CASCADE)