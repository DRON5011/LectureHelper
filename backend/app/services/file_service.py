import os
import uuid

from fastapi import UploadFile


UPLOAD_DIR = "uploads"


class FileService:

    async def save_audio(
        self,
        file: UploadFile
    ) -> str:

        os.makedirs(
            UPLOAD_DIR,
            exist_ok=True
        )

        ext = file.filename.split(".")[-1]

        filename = f"{uuid.uuid4()}.{ext}"

        path = os.path.join(
            UPLOAD_DIR,
            filename
        )

        with open(path, "wb") as buffer:

            content = await file.read()

            buffer.write(content)

        return path


file_service = FileService()