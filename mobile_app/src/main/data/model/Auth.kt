data class LoginRequest(
    val username: String,
    val password: String
)

data class RegisterRequest(
    val username: String,
    val password: String,
    val email: String,
    val full_name: String,
    val role: String
)

data class TokenResponse(
    val access: String,
    val refresh: String,
    val role: String
)