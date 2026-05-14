from sqlalchemy.ext.asyncio import AsyncSession

from app.repositories.metaphor_repository import (
    metaphor_repository
)

from app.schemas.metaphor import (
    MetaphorCreate
)


class MetaphorService:

    async def create_metaphor(
        self,
        db: AsyncSession,
        data: MetaphorCreate,
        teacher_id: int
    ):

        obj = data.model_dump()

        obj["teacher_id"] = teacher_id

        return await metaphor_repository.create(
            db,
            obj
        )

    async def get_record_metaphors(
        self,
        db: AsyncSession,
        record_id: int
    ):

        return await metaphor_repository.get_by_record(
            db,
            record_id
        )


metaphor_service = MetaphorService()