package maxonline.server

import io.ktor.application.*
import io.ktor.features.origin
import io.ktor.html.*
import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readBytes
import io.ktor.http.content.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.websocket.WebSockets
import io.ktor.websocket.webSocket
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.html.*

fun main() {
    val gameServer = GameServer()

    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        install(WebSockets)
        routing {
            get("/") {
                call.respondHtml {
                    head {
                        title("KotlinJsJvmGame")
                    }
                    body {
                        div { id = "gameContainer" }
                        script(src = "/static/KotlinJsJvmGame.js") {}
                    }
                }
            }
            static("/static") {
                resource("KotlinJsJvmGame.js")
            }
            webSocket("/") {
                log.info("New player connected: ${call.request.origin.host}")
                try {
                    for (frame in incoming) {
                        val bytes = (frame as Frame.Binary).readBytes()
                        gameServer.onMessage(bytes, this)
                    }
                } catch (e: ClosedReceiveChannelException) {
                    log.error("onClosedException ${closeReason.await()} : ${call.request.origin.host}", e)
                } catch (e: Throwable) {
                    log.error("onError: ${call.request.origin.host}", e)
                } finally {
                    log.info("player disconnected ${call.request.origin.host}")
                    gameServer.onClose(this)
                }
            }
        }

    }.start(wait = true)
}