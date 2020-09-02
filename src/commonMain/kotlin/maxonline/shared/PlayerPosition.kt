package maxonline.shared

import io.ktor.utils.io.core.*


data class PlayerPosition(val x: Short, val y: Short){
    constructor(byteArray: ByteArray) : this(ByteReadPacket(byteArray))
    private constructor(reader: ByteReadPacket) : this(
            x = reader.readShort(),
            y = reader.readShort()
    )

    fun toByteArray(): ByteArray {
        val builder = BytePacketBuilder()
        builder.writeShort(x)
        builder.writeShort(y)
        return builder.build().readBytes()
    }
}