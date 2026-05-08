from django.db import models
from django.conf import settings

User = settings.AUTH_USER_MODEL

class Lecture(models.Model):
    STATUS = (
        ('planned', 'Запланирована'),
        ('done', 'Проведена'),
        ('canceled', 'Отменена'),
    )

    lection_name = models.CharField(max_length=255)
    cource_name = models.CharField(max_length=255)
    lection_date = models.DateField()
    start_time = models.TimeField()
    end_time = models.TimeField()
    status = models.CharField(max_length=10, choices=STATUS)
    records = models.ForeignKey(Records, on_delete=models.CASCADE)
    teachers = models.ForeignKey(Teachers, on_delete=models.CASCADE)