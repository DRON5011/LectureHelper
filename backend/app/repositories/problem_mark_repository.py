from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select

from app.models.problem_mark import ProblemMark
from app.repositories.base import BaseRepository


class ProblemMarkRepository(
    BaseRepository[ProblemMark]
):

    def __init__(self):
        super().__init__(ProblemMark)

    async def get_by_record(
        self,
        db: AsyncSession,
        record_id: int
    ):

        result = await db.execute(
            select(ProblemMark).where(
                ProblemMark.record_id == record_id
            )
        )

        return result.scalars().all()


problem_mark_repository = ProblemMarkRepository()