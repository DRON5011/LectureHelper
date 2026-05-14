from sqlalchemy import (
    String,
    ForeignKey,
    Date,
    Time
)

from sqlalchemy.orm import (
    Mapped,
    mapped_column,
    relationship
)

from app.models.base import Base, TimestampMixin

class Lecture(Base, TimestampMixin):

    __tablename__ = "lections"

    id: Mapped[int] = mapped_column(primary_key=True)

    lection_name: Mapped[str] = mapped_column(String)

    course_name: Mapped[str] = mapped_column(String)

    lection_date: Mapped[Date]

    start_time: Mapped[Time]

    end_time: Mapped[Time]

    status: Mapped[str] = mapped_column(String)

    teacher_id: Mapped[int] = mapped_column(
        ForeignKey("users.id")
    )

    teacher = relationship(
        "User",
        back_populates="lections"
    )

    record = relationship(
        "Record",
        back_populates="lecture",
        uselist=False
    )