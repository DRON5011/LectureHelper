from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.schemas.metaphor import (
    MetaphorCreate
)

from app.services.metaphor_service import (
    metaphor_service
)

from app.deps.auth import (
    get_current_user
)

from app.models.user import User


router = APIRouter(
    prefix="/metaphors",
    tags=["Metaphors"]
)


@router.post("/")
async def create_metaphor(

    data: MetaphorCreate,

    current_user: User = Depends(
        get_current_user
    ),

    db: AsyncSession = Depends(get_db)
):

    return await metaphor_service.create_metaphor(
        db,
        data,
        current_user.id
    )


@router.get("/{record_id}")
async def get_metaphors(
    record_id: int,
    db: AsyncSession = Depends(get_db)
):

    return await metaphor_service.get_record_metaphors(
        db,
        record_id
    )