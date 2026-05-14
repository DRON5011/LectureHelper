from fastapi import APIRouter

router = APIRouter(
    prefix="/problem-marks",
    tags=["Problem Marks"]
)


@router.get("/")
async def get_problem_marks():

    return {
        "message": "Problem marks endpoint"
    }