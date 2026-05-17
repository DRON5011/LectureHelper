class AppException(Exception):
    def __init__(self, detail: str, status_code: int = 400):
        self.detail = detail
        self.status_code = status_code

class NotFoundError(AppException):
    def __init__(self, entity: str):
        super().__init__(f"{entity} не найдена!", 404)

class ConflictError(AppException):
    def __init__(self, detail: str):
        super().__init__(detail, 409)
