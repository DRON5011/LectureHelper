from sqlalchemy import String
from sqlalchemy.orm import Mapped, mapped_column, relationship

from app.models.base import Base, TimestampMixin

class User(Base, TimestampMixin):

    __tablename__ = "users"

    id: Mapped[int] = mapped_column(primary_key=True)

    fio: Mapped[str] = mapped_column(String(128))

    email: Mapped[str] = mapped_column(
        String(128),
        unique=True
    )

    password: Mapped[str] = mapped_column(String)

    role: Mapped[str] = mapped_column(String(15))

    lections = relationship(
        "Lecture",
        back_populates="teacher"
    )

    metaphors = relationship(
        "Metaphor",
        back_populates="teacher"
    )

    problem_marks = relationship(
        "ProblemMark",
        back_populates="student"
    )