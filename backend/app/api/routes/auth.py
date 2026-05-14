from datetime import timedelta

from fastapi import APIRouter
from fastapi import Depends
from fastapi import HTTPException

from fastapi.security import OAuth2PasswordRequestForm

from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select

from passlib.context import CryptContext

from jose import jwt

from app.models.user import User

from app.core.database import get_db
from app.core.config import settings

router = APIRouter(
    prefix="/auth",
    tags=["Auth"]
)

pwd_context = CryptContext(
    schemes=["bcrypt"],
    deprecated="auto"
)

ALGORITHM = "HS256"


def create_access_token(data: dict):

    return jwt.encode(
        data,
        settings.SECRET_KEY,
        algorithm=ALGORITHM
    )


@router.post("/register")
async def register(
    fio: str,
    email: str,
    password: str,
    db: AsyncSession = Depends(get_db)
):

    existing_user = await db.execute(
        select(User).where(User.email == email)
    )

    if existing_user.scalar():

        raise HTTPException(
            status_code=400,
            detail="User already exists"
        )

    hashed_password = pwd_context.hash(password)

    user = User(
        fio=fio,
        email=email,
        password=hashed_password,
        role="student"
    )

    db.add(user)

    await db.commit()

    return {
        "message": "User created"
    }


@router.post("/login")
async def login(
    form_data: OAuth2PasswordRequestForm = Depends(),
    db: AsyncSession = Depends(get_db)
):

    result = await db.execute(
        select(User).where(
            User.email == form_data.username
        )
    )

    user = result.scalar()

    if not user:

        raise HTTPException(
            status_code=401,
            detail="Invalid credentials"
        )

    valid = pwd_context.verify(
        form_data.password,
        user.password
    )

    if not valid:

        raise HTTPException(
            status_code=401,
            detail="Invalid credentials"
        )

    token = create_access_token(
        {
            "sub": str(user.id)
        }
    )

    return {
        "access_token": token,
        "token_type": "bearer"
    }