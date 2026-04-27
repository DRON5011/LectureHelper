from django.db import models
from django.conf import settings

User = settings.AUTH_USER_MODEL

class Lecture(models.Model):
    STATUS = (
        ('planned', 'Запланирована'),
        ('done', 'Проведена'),
        ('canceled', 'Отменена'),
    )

    title = models.CharField(max_length=255)
    subject = models.CharField(max_length=255)
    date = models.DateField()
    start_time = models.TimeField()
    end_time = models.TimeField()
    status = models.CharField(max_length=10, choices=STATUS)

    teacher = models.ForeignKey(User, on_delete=models.CASCADE)