import kotlinx.datetime.LocalDateTime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
