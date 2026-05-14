from fastapi import Depends, HTTPException
from fastapi.security import OAuth2PasswordBearer

from jose import jwt, JWTError

from sqlalchemy.ext.asyncio import AsyncSession

from app.db.session import get_db

from app.models.user import User

from app.repositories.user_repository import (
    user_repository
)

from app.core.config import settings


oauth2_scheme = OAuth2PasswordBearer(
    tokenUrl="/api/v1/auth/login"
)


async def get_current_user(

    token: str = Depends(oauth2_scheme),

    db: AsyncSession = Depends(get_db)
) -> User:

    credentials_exception = HTTPException(
        status_code=401,
        detail="Invalid token"
    )

    try:

        payload = jwt.decode(
            token,
            settings.SECRET_KEY,
            algorithms=[settings.ALGORITHM]
        )

        user_id = payload.get("sub")

        if user_id is None:
            raise credentials_exception

    except JWTError:
        raise credentials_exception

    user = await user_repository.get(
        db,
        int(user_id)
    )

    if not user:
        raise credentials_exception

    return user