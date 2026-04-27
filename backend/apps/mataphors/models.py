from django.db import models
from apps.lectures.models import Lecture
from apps.users.models import User

class Metaphor(models.Model):
    text = models.TextField()
    teacher = models.ForeignKey('users.User', on_delete=models.CASCADE)
    lecture = models.ForeignKey('lectures.Lecture', on_delete=models.CASCADE)