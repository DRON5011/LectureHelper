from datetime import date
from datetime import time
from datetime import datetime
from pydantic import field_validator

from pydantic import BaseModel


class CreateLectureRequest(BaseModel):

    lection_name: str

    course_name: str

    lection_date: date
    
    start_time: time
    
    end_time: time

    @field_validator('end_time')
    def check_end_after_start(cls, v, values):
        if 'start_time' in values and v <= values['start_time']:
            raise ValueError('end_time must be after start_time')
        return v

    status: str


class UpdateLectureRequest(BaseModel):

    lection_name: str

    course_name: str

    lection_date: date

    start_time: time

    end_time: time

    @field_validator('end_time')
    def check_end_after_start(cls, v, values):
        if 'start_time' in values and v <= values['start_time']:
            raise ValueError('end_time must be after start_time')
        return v

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
