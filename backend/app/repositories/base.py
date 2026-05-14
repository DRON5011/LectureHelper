from typing import Type, TypeVar, Generic, Optional, List

from sqlalchemy.ext.asyncio import AsyncSession
from sqlalchemy import select

from app.db.base import Base


ModelType = TypeVar("ModelType", bound=Base)


class BaseRepository(Generic[ModelType]):

    def __init__(
        self,
        model: Type[ModelType]
    ):
        self.model = model

    async def get(
        self,
        db: AsyncSession,
        obj_id: int
    ) -> Optional[ModelType]:

        result = await db.execute(
            select(self.model).where(
                self.model.id == obj_id
            )
        )

        return result.scalar_one_or_none()

    async def get_all(
        self,
        db: AsyncSession
    ) -> List[ModelType]:

        result = await db.execute(
            select(self.model)
        )

        return result.scalars().all()

    async def create(
        self,
        db: AsyncSession,
        obj_in: dict
    ) -> ModelType:

        db_obj = self.model(**obj_in)

        db.add(db_obj)

        await db.commit()

        await db.refresh(db_obj)

        return db_obj

    async def update(
        self,
        db: AsyncSession,
        db_obj: ModelType,
        obj_in: dict
    ) -> ModelType:

        for field, value in obj_in.items():
            setattr(db_obj, field, value)

        await db.commit()

        await db.refresh(db_obj)

        return db_obj

    async def delete(
        self,
        db: AsyncSession,
        obj_id: int
    ) -> None:

        obj = await self.get(db, obj_id)

        if obj:
            await db.delete(obj)
            await db.commit()