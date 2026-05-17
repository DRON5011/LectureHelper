from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select
from sqlalchemy.orm import selectinload

from app.models.record import Record
from app.repositories.base import BaseRepository


class RecordRepository(
    BaseRepository[Record]
):

    def __init__(self):
        super().__init__(Record)

    async def get_full_record(
        self,
        db: AsyncSession,
        record_id: int
    ):

        result = await db.execute(
            select(Record)
            .options(
                selectinload(Record.problem_marks),
                selectinload(Record.metaphors)
            )
            .where(
                Record.id == record_id
            )
        )

        return result.scalar_one_or_none()


record_repository = RecordRepository()