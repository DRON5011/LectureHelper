from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.services.record_service import (
    record_service
)


router = APIRouter(
    prefix="/records",
    tags=["Records"]
)


@router.get("/{record_id}")
async def get_record(
    record_id: int,
    db: AsyncSession = Depends(get_db)
):

    return await record_service.get_record(
        db,
        record_id
    )