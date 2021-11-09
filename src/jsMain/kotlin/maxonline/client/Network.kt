package maxonline.client

import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import maxonline.shared.GameMessage
import maxonline.shared.HandshakeFromPlayer
import maxonline.shared.PlayerMessage
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.get
import org.w3c.dom.CloseEvent
import org.w3c.dom.ErrorEvent
import org.w3c.dom.MessageEvent
import org.w3c.dom.WebSocket
import org.w3c.files.Blob
import org.w3c.files.FileReader

class Network(server: String, onMessage: (GameMessage) -> Unit) {
    private val webSocket = WebSocket(server)

    private val format = ProtoBuf { encodeDefaults = false }
    //private val format = Cbor { encodeDefaults = true }

    init {
        webSocket.onmessage = { messageEvent ->
            messageEvent.readBytes { bytes ->
                val message = format.decodeFromByteArray<GameMessage>(bytes)
                onMessage(message)
            }
        }

        webSocket.onerror = {
            if (it is ErrorEvent) {
                println("ERROR: ${it.message}")
            } else {
                println("UNKNOWN ERROR: ${it.type}")
            }
        }

        webSocket.onopen = {
            println("Connected to Websocket")
            sendMessage(PlayerMessage(handshake = HandshakeFromPlayer())) // TODO already exsisting playerId?
        }

        webSocket.onclose = {
            if (it is CloseEvent) {
                println("Websocket disconnected: ${it.reason}")
            } else {
                println("Websocket disconnected.")
            }
        }

    }

    fun sendMessage(playerMessage: PlayerMessage) {
        if (webSocket.readyState == WebSocket.OPEN) {

            val bytes = format.encodeToByteArray(playerMessage)
            webSocket.send(Int8Array(bytes.toTypedArray()))
        }
    }

    private fun MessageEvent.readBytes(onReadDone: (ByteArray) -> Unit) {
        val data: Blob = data as Blob

        val fileReader = FileReader()
        fileReader.addEventListener("loadend", {
            val arrayBuffer = fileReader.result as ArrayBuffer
            val uint8Array = Uint8Array(arrayBuffer)
            val byteArray = ByteArray(uint8Array.byteLength) { index -> uint8Array[index] }

            onReadDone(byteArray)
        })
        fileReader.readAsArrayBuffer(data)
    }
}