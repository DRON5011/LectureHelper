class AIService:

    async def transcribe_audio(
        self,
        audio_path: str
    ) -> str:

        """
        Whisper transcription
        """

        return "Transcribed text"

    async def generate_summary(
        self,
        text: str
    ) -> str:

        """
        GPT summary
        """

        return "Lecture summary"


ai_service = AIService()