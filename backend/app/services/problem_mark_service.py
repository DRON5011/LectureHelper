from sqlalchemy.ext.asyncio import AsyncSession

from app.repositories.problem_mark_repository import (
    problem_mark_repository
)

from app.schemas.problem_mark import (
    ProblemMarkCreate
)


class ProblemMarkService:

    async def create_mark(
        self,
        db: AsyncSession,
        data: ProblemMarkCreate,
        student_id: int
    ):

        obj = data.model_dump()

        obj["student_id"] = student_id

        return await problem_mark_repository.create(
            db,
            obj
        )

    async def get_record_marks(
        self,
        db: AsyncSession,
        record_id: int
    ):

        return await problem_mark_repository.get_by_record(
            db,
            record_id
        )


problem_mark_service = ProblemMarkService()