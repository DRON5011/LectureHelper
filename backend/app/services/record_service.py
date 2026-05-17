from sqlalchemy.ext.asyncio import AsyncSession

from app.repositories.record_repository import record_repository


class RecordService:

    async def get_record(
        self,
        db: AsyncSession,
        record_id: int
    ):

        return await record_repository.get_full_record(
            db,
            record_id
        )


record_service = RecordService()