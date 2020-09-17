package maxonline.shared
import kotlinx.serialization.*

@Serializable
data class GameMessage (val players:Collection<Player>, val yourId: Short)

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
data class PlayerMessage (val player:Player)
