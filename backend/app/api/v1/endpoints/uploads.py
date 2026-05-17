from fastapi import APIRouter
from fastapi import UploadFile
from fastapi import File

from app.services.file_service import (
    file_service
)

from app.services.ai_service import (
    ai_service
)


router = APIRouter(
    prefix="/uploads",
    tags=["Uploads"]
)


@router.post("/audio")
async def upload_audio(
    file: UploadFile = File(...)
):

    path = await file_service.save_audio(
        file
    )

    text = await ai_service.transcribe_audio(
        path
    )

    summary = await ai_service.generate_summary(
        text
    )

    return {
        "audio_path": path,
        "transcript": text,
        "summary": summary
    }