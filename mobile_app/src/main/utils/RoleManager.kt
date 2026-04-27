class RoleManager(private val context: Context) {

    private val prefs = context.getSharedPreferences("app", Context.MODE_PRIVATE)

    fun saveRole(role: String) {
        prefs.edit().putString("role", role).apply()
    }

    fun getRole(): String? {
        return prefs.getString("role", null)
    }

    fun isTeacher(): Boolean {
        return getRole() == "teacher"
    }
}