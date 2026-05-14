from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.core.database import get_db

from app.schemas.lecture import (
    CreateLectureRequest,
    LectureResponse
)
from app.models.lecture import Lecture

from fastapi import HTTPException

from sqlalchemy import select

from app.models.user import User

from app.api.dependencies import get_current_user

router = APIRouter(
    prefix="/lectures",
    tags=["Lectures"]
)


@router.get("/")
async def get_lectures(
    db: AsyncSession = Depends(get_db)
):

    result = await db.execute(
        select(Lecture)
    )

    lectures = result.scalars().all()

    return lectures


@router.get("/{lecture_id}")
async def get_lecture(
    lecture_id: int,
    db: AsyncSession = Depends(get_db)
):

    lecture = await db.get(
        Lecture,
        lecture_id
    )

    if not lecture:

        raise HTTPException(
            status_code=404,
            detail="Lecture not found"
        )

    return lecture


@router.post(
    "/",
    response_model=LectureResponse
)
async def create_lecture(
    data: CreateLectureRequest,
    db: AsyncSession = Depends(get_db)
):

    lecture = Lecture(
        lection_name=data.lection_name,
        course_name=data.course_name,
        lection_date=data.lection_date,
        start_time=data.start_time,
        end_time=data.end_time,
        status=data.status,
        teacher_id=1
    )

    db.add(lecture)

    await db.commit()

    await db.refresh(lecture)

    return lecture


@router.delete("/{lecture_id}")
async def delete_lecture(
    lecture_id: int,
    db: AsyncSession = Depends(get_db)
):

    lecture = await db.get(
        Lecture,
        lecture_id
    )

    if not lecture:

        raise HTTPException(
            status_code=404,
            detail="Lecture not found"
        )

    await db.delete(lecture)

    await db.commit()

    return {
        "message": "Lecture deleted"
    }