from fastapi import APIRouter

from app.api.v1.endpoints import (
    auth,
    lectures,
    uploads,
    records,
    problem_marks,
    metaphors
)


api_router = APIRouter()

api_router.include_router(auth.router)

api_router.include_router(lectures.router)

api_router.include_router(uploads.router)

api_router.include_router(records.router)

api_router.include_router(problem_marks.router)

api_router.include_router(metaphors.router)