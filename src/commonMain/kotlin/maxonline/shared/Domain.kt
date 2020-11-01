package maxonline.shared
import kotlinx.serialization.*

@Serializable
data class GameMessage (val players:ArrayList<Player>? = null, val yourId: Short? = null)

@Serializable
data class Player(
    val x: Short,
    val y: Short,
    val red: Byte,
    val green: Byte,
    val blue: Byte,
    val score: Byte,
    val playerId: Short
)

@Serializable
data class PlayerMessage (
    val player: Player? = null,
    val clicked: Boolean? = null,
)
