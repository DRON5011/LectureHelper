from django.db import models
from apps.lectures.models import Lecture
from apps.users.models import User

class ProblemPoint(models.Model):
    description = models.TextField()
    student = models.ForeignKey('users.User', on_delete=models.CASCADE)
    lecture = models.ForeignKey('lectures.Lecture', on_delete=models.CASCADE)