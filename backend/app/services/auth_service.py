from sqlalchemy.ext.asyncio import AsyncSession

from app.repositories.user_repository import user_repository
from app.schemas.user import UserCreate
from app.models.user import User

from app.core.security import (
    hash_password,
    verify_password,
    create_access_token
)


class AuthService:

    async def register(
        self,
        db: AsyncSession,
        user_data: UserCreate
    ) -> User:

        existing_user = await user_repository.get_by_email(
            db,
            user_data.email
        )

        if existing_user:
            raise Exception("User already exists")

        hashed_password = hash_password(
            user_data.password
        )

        user_dict = user_data.model_dump()

        user_dict["password"] = hashed_password

        return await user_repository.create(
            db,
            user_dict
        )

    async def login(
        self,
        db: AsyncSession,
        email: str,
        password: str
    ):

        user = await user_repository.get_by_email(
            db,
            email
        )

        if not user:
            raise Exception("Invalid credentials")

        if not verify_password(
            password,
            user.password
        ):
            raise Exception("Invalid credentials")

        token = create_access_token(
            {
                "sub": str(user.id)
            }
        )

        return {
            "access_token": token,
            "token_type": "bearer"
        }


auth_service = AuthService()