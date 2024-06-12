import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.internal.JSJoda.DateTimeFormatter

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

