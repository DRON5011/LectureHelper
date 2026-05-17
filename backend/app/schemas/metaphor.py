from datetime import time
from datetime import datetime

from pydantic import BaseModel


class CreateMetaphorRequest(BaseModel):

    short_name: str

    desc: str

    start_time: time

    end_time: time

    record_id: int


class MetaphorResponse(BaseModel):

    id: int

    short_name: str

    desc: str

    start_time: time

    end_time: time

    record_id: int

    teacher_id: int

    created_at: datetime

    updated_at: datetime

    class Config:

        from_attributes = True