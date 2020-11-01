package maxonline.shared
import kotlinx.serialization.*

typealias PlayerId = Short

@Serializable
data class GameMessage (
    val players:List<Player>? = null,
    val yourId: PlayerId? = null,
    val deathCircles:List<DeathCircle>? = null
)

@Serializable
data class DeathCircle(
    val diameter: Short,
    val x: Short,
    val y: Short,
    val red: Byte,
    val green: Byte,
    val blue: Byte,
    val owner: PlayerId,
)

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
)
