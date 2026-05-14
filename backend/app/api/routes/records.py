from pathlib import Path

from fastapi import APIRouter
from fastapi import UploadFile
from fastapi import File

router = APIRouter(
    prefix="/records",
    tags=["Records"]
)

UPLOAD_DIR = "uploads"

Path(UPLOAD_DIR).mkdir(
    exist_ok=True
)


@router.post("/upload-audio")
async def upload_audio(
    file: UploadFile = File(...)
):

    file_path = f"{UPLOAD_DIR}/{file.filename}"

    with open(file_path, "wb") as buffer:

        content = await file.read()

        buffer.write(content)

    return {
        "filename": file.filename,
        "path": file_path
    }