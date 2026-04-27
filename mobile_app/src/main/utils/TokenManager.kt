class TokenManager(context: Context) {

    private val prefs = context.getSharedPreferences("app", Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        prefs.edit().putString("token", token).apply()
    }

    fun getToken(): String? {
        return prefs.getString("token", null)
    }
}