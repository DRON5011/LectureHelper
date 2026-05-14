from sqlalchemy import (
    String,
    ForeignKey
)

from sqlalchemy.orm import (
    Mapped,
    mapped_column,
    relationship
)

from app.models.base import Base, TimestampMixin

class Record(Base, TimestampMixin):

    __tablename__ = "records"

    id: Mapped[int] = mapped_column(primary_key=True)

    file_name: Mapped[str] = mapped_column(String)

    url_audio: Mapped[str] = mapped_column(String)

    url_texted_audio: Mapped[str] = mapped_column(String)

    url_conspect: Mapped[str] = mapped_column(String)

    lecture_id: Mapped[int] = mapped_column(
        ForeignKey("lections.id"),
        unique=True
    )

    lecture = relationship(
        "Lecture",
        back_populates="record"
    )

    problem_marks = relationship(
        "ProblemMark",
        back_populates="record"
    )

    metaphors = relationship(
        "Metaphor",
        back_populates="record"
    )