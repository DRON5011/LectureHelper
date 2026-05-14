from pydantic_settings import BaseSettings


class Settings(BaseSettings):

    PROJECT_NAME: str = "LectureHelper API"

    API_V1_STR: str = "/api/v1"

    SECRET_KEY: str = "SUPER_SECRET_KEY"

    ALGORITHM: str = "HS256"

    ACCESS_TOKEN_EXPIRE_MINUTES: int = 60

    POSTGRES_SERVER: str = "localhost"

    POSTGRES_PORT: int = 5432

    POSTGRES_USER: str = "postgres"

    POSTGRES_PASSWORD: str = "22082004"

    POSTGRES_DB: str = "lecturehelper"

    DATABASE_URL: str = (
        "postgresql+asyncpg://"
        f"{POSTGRES_USER}:{POSTGRES_PASSWORD}"
        f"@{POSTGRES_SERVER}:{POSTGRES_PORT}"
        f"/{POSTGRES_DB}"
    )

    class Config:
        env_file = ".env"


settings = Settings()