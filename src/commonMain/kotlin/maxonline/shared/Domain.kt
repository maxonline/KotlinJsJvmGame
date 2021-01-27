package maxonline.shared
import kotlinx.serialization.*

typealias PlayerId = Short

@Serializable
data class GameMessage (
    val players:List<Player>? = null,
    val handshake: HandshakeFromServer? = null,
    val circles:List<GameCircle>? = null
)

@Serializable
data class HandshakeFromServer(
    val you:Player
)


@Serializable
data class GameCircle(
    val diameter: Short,
    val x: Short,
    val y: Short,
    val red: Byte,
    val green: Byte,
    val blue: Byte,
    val owner: PlayerId,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GameCircle

        if (x != other.x) return false
        if (y != other.y) return false
        if (owner != other.owner) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x.toInt()
        result = 31 * result + y.toInt()
        result = 31 * result + owner
        return result
    }
}

@Serializable
data class Player(
    val x: Short,
    val y: Short,
    val red: Byte,
    val green: Byte,
    val blue: Byte,
    val score: Byte,
    val playerId: Short,
)

@Serializable
data class PlayerMessage (
    val player: Player? = null,
    val clicked: Boolean? = null,
    val handshake: HandshakeFromPlayer? = null,
)

@Serializable
data class HandshakeFromPlayer(
    val playerId: Short? = null,
)
