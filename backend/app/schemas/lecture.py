from datetime import date
from datetime import time
from datetime import datetime

from pydantic import BaseModel


class CreateLectureRequest(BaseModel):

    lection_name: str

    course_name: str

    lection_date: date

    start_time: time

    end_time: time

    status: str


class UpdateLectureRequest(BaseModel):

    lection_name: str

    course_name: str

    lection_date: date

    start_time: time

    end_time: time

    status: str


class LectureResponse(BaseModel):

    id: int

    lection_name: str

    course_name: str

    lection_date: date

    start_time: time

    end_time: time

    status: str

    teacher_id: int

    created_at: datetime

    updated_at: datetime

    class Config:

        from_attributes = True