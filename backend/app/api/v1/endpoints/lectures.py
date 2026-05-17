from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.schemas.lecture import (
    LectureCreate,
    LectureUpdate
)

from app.services.lecture_service import (
    lecture_service
)

from app.deps.auth import (
    get_current_user
)

from app.models.user import User


router = APIRouter(
    prefix="/lectures",
    tags=["Lectures"]
)


@router.get("/")
async def get_lectures(
    db: AsyncSession = Depends(get_db)
):

    return await lecture_service.get_all(db)


@router.get("/{lecture_id}")
async def get_lecture(
    lecture_id: int,
    db: AsyncSession = Depends(get_db)
):

    return await lecture_service.get_by_id(
        db,
        lecture_id
    )


@router.post("/")
async def create_lecture(

    lecture_data: LectureCreate,

    current_user: User = Depends(
        require_role("teacher")
    ),

    db: AsyncSession = Depends(get_db)
):

    return await lecture_service.create_lecture(
        db,
        lecture_data,
        current_user.id
    )


@router.put("/{lecture_id}")
async def update_lecture(
    lecture_id: int,

    lecture_data: LectureUpdate,

    db: AsyncSession = Depends(get_db)
):

    return await lecture_service.update_lecture(
        db,
        lecture_id,
        lecture_data
    )


@router.delete("/{lecture_id}")
async def delete_lecture(
    lecture: Lecture = Depends(require_lecture_owner(lecture_id)),
    lecture_id: int,
    db: AsyncSession = Depends(get_db)
):

    await lecture_service.delete_lecture(
        db,
        lecture_id
    )

    return {"message": "Deleted"}
