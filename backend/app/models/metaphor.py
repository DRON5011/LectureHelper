from sqlalchemy import (
    String,
    ForeignKey,
    Time
)

from sqlalchemy.orm import (
    Mapped,
    mapped_column,
    relationship
)

from app.models.base import Base, TimestampMixin

class Metaphor(Base, TimestampMixin):

    __tablename__ = "metaphors"

    id: Mapped[int] = mapped_column(primary_key=True)

    short_name: Mapped[str] = mapped_column(String)

    desc: Mapped[str] = mapped_column(String)

    start_time: Mapped[Time]

    end_time: Mapped[Time]

    record_id: Mapped[int] = mapped_column(
        ForeignKey("records.id")
    )

    teacher_id: Mapped[int] = mapped_column(
        ForeignKey("users.id")
    )

    record = relationship(
        "Record",
        back_populates="metaphors"
    )

    teacher = relationship(
        "User",
        back_populates="metaphors"
    )