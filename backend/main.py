from fastapi import FastAPI

from app.core.config import settings

from app.api.v1.api import api_router

from app.middleware.exception_handler import (
    global_exception_handler
)


app = FastAPI(
    title=settings.PROJECT_NAME
)


app.include_router(
    api_router,
    prefix=settings.API_V1_STR
)


app.add_exception_handler(
    Exception,
    global_exception_handler
)


@app.get("/")
async def root():

    return {
        "message": "LectureHelper API"
    }