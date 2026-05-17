# tests/test_auth.py
import pytest
from httpx import AsyncClient

@pytest.mark.asyncio
async def test_register(client: AsyncClient):
    response = await client.post("/api/v1/auth/register", json={
        "fio": "Test User",
        "email": "test@example.com",
        "password": "12345678"
    })
    assert response.status_code == 200
    assert response.json()["message"] == "Пользователь создан!"
