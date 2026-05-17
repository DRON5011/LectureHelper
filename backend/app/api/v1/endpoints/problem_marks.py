from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.schemas.problem_mark import (
    ProblemMarkCreate
)

from app.services.problem_mark_service import (
    problem_mark_service
)

from app.deps.auth import (
    get_current_user
)

from app.models.user import User


router = APIRouter(
    prefix="/problem-marks",
    tags=["Problem Marks"]
)


@router.post("/")
async def create_problem_mark(

    data: ProblemMarkCreate,

    current_user: User = Depends(
        get_current_user
    ),

    db: AsyncSession = Depends(get_db)
):

    return await problem_mark_service.create_mark(
        db,
        data,
        current_user.id
    )


@router.get("/{record_id}")
async def get_problem_marks(
    record_id: int,
    db: AsyncSession = Depends(get_db)
):

    return await problem_mark_service.get_record_marks(
        db,
        record_id
    )