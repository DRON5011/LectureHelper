from fastapi import APIRouter

router = APIRouter(
    prefix="/metaphors",
    tags=["Metaphors"]
)


@router.get("/")
async def get_metaphors():

    return {
        "message": "Metaphors endpoint"
    }