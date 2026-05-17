from fastapi import APIRouter
from fastapi import Depends

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.schemas.user import (
    UserCreate,
    UserLogin
)

from app.services.auth_service import (
    auth_service
)


router = APIRouter(
    prefix="/auth",
    tags=["Auth"]
)


@router.post("/register")
async def register(
    user_data: UserCreate,
    db: AsyncSession = Depends(get_db)
):

    return await auth_service.register(
        db,
        user_data
    )


@router.post("/login")
async def login(
    user_data: UserLogin,
    db: AsyncSession = Depends(get_db)
):

    return await auth_service.login(
        db,
        user_data.email,
        user_data.password
    )