from sqlalchemy.ext.asyncio import AsyncSession

from app.repositories.lecture_repository import lecture_repository

from app.schemas.lecture import (
    LectureCreate,
    LectureUpdate
)


class LectureService:

    async def create_lecture(
        self,
        db: AsyncSession,
        lecture_data: LectureCreate,
        teacher_id: int
    ):

        data = lecture_data.model_dump()

        data["teacher_id"] = teacher_id

        return await lecture_repository.create(
            db,
            data
        )

    async def get_all(
        self,
        db: AsyncSession
    ):

        return await lecture_repository.get_all(db)

    async def get_by_id(
        self,
        db: AsyncSession,
        lecture_id: int
    ):

        return await lecture_repository.get_with_record(
            db,
            lecture_id
        )

    async def update_lecture(
        self,
        db: AsyncSession,
        lecture_id: int,
        lecture_data: LectureUpdate
    ):

        lecture = await lecture_repository.get(
            db,
            lecture_id
        )

        if not lecture:
            raise Exception("Lecture not found")

        return await lecture_repository.update(
            db,
            lecture,
            lecture_data.model_dump(
                exclude_unset=True
            )
        )

    async def delete_lecture(
        self,
        db: AsyncSession,
        lecture_id: int
    ):

        await lecture_repository.delete(
            db,
            lecture_id
        )


lecture_service = LectureService()