from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select

from app.models.metaphor import Metaphor
from app.repositories.base import BaseRepository


class MetaphorRepository(
    BaseRepository[Metaphor]
):

    def __init__(self):
        super().__init__(Metaphor)

    async def get_by_record(
        self,
        db: AsyncSession,
        record_id: int
    ):

        result = await db.execute(
            select(Metaphor).where(
                Metaphor.record_id == record_id
            )
        )

        return result.scalars().all()


metaphor_repository = MetaphorRepository()