class AuthRepository(
    private val api: ApiService,
    private val tokenManager: TokenManager,
    private val roleManager: RoleManager
) {

    suspend fun login(username: String, password: String): Boolean {

        val response = api.login(LoginRequest(username, password))

        if (response.isSuccessful) {

            response.body()?.let {

                // 🔐 1. токен
                tokenManager.saveToken(it.access)

                // 👤 2. РОЛЬ (ВОТ СЮДА!)
                roleManager.saveRole(it.role)

                return true
            }
        }

        return false
    }
}