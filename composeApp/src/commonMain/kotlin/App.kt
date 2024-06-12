import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.utils.io.core.use
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        httpCall()
    }
}

fun httpCall() = CoroutineScope(Job()).launch {
    HttpClient().use { httpClient ->
        httpClient.get("https://kotlinlang.org")
            .bodyAsText()
            .let {
                val s = it.take(20)
                println(s)
            }
    }
}
