from datetime import datetime

from pydantic import BaseModel


class RecordResponse(BaseModel):

    id: int

    file_name: str

    url_audio: str

    url_texted_audio: str

    url_conspect: str

    lecture_id: int

    created_at: datetime

    updated_at: datetime

    class Config:

        from_attributes = True