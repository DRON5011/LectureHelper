def require_role(role: str):
    async def dependency(current_user: User = Depends(get_current_user)):
        if current_user.role != role and current_user.role != "admin":
            raise HTTPException(status_code=403, detail=f"Requires {role} role")
        return current_user
    return dependency

def require_lecture_owner(lecture_id: int):
    async def dependency(lecture_id: int, current_user: User = Depends(get_current_user), db: AsyncSession = Depends(get_db)):
        lecture = await db.get(Lecture, lecture_id)
        if not lecture:
            raise HTTPException(404, "Lecture not found")
        if current_user.id != lecture.teacher_id and current_user.role != "admin":
            raise HTTPException(403, "Not owner")
        return lecture
    return dependency
