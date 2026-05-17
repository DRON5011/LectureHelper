from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select
from sqlalchemy.orm import selectinload

from app.models.lecture import Lecture
from app.repositories.base import BaseRepository


class LectureRepository(
    BaseRepository[Lecture]
):

    def __init__(self):
        super().__init__(Lecture)

    async def get_with_record(
        self,
        db: AsyncSession,
        lecture_id: int
    ):

        result = await db.execute(
            select(Lecture)
            .options(
                selectinload(Lecture.record)
            )
            .where(
                Lecture.id == lecture_id
            )
        )

        return result.scalar_one_or_none()

    async def get_teacher_lectures(
        self,
        db: AsyncSession,
        teacher_id: int
    ):

        result = await db.execute(
            select(Lecture).where(
                Lecture.teacher_id == teacher_id
            )
        )

        return result.scalars().all()


lecture_repository = LectureRepository()