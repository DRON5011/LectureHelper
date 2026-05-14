from datetime import datetime

from pydantic import BaseModel
from pydantic import EmailStr


class UserResponse(BaseModel):

    id: int

    fio: str

    email: EmailStr

    role: str

    created_at: datetime

    updated_at: datetime

    class Config:

        from_attributes = True