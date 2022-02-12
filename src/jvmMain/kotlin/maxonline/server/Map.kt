package maxonline.server

import maxonline.shared.MapTiles
import maxonline.shared.Tile
import maxonline.shared.TileCoordinate
import java.net.URL
import javax.imageio.ImageIO

fun loadMap(mapFile: URL?): MapTiles {
    println("Map:$mapFile")
    val image = ImageIO.read(mapFile)

    val map = HashMap<TileCoordinate, Tile>()

    (0 until   image.height).forEach { y ->
        (0 until image.width).forEach { x ->
            val color = image.getRGB(x, y)
            if (color.isWall()) {
                print("#")
                map[TileCoordinate(x,y)] = Tile.WALL
            } else {
                print(" ")
                map[TileCoordinate(x,y)] = Tile.EMPTY

            }
        }
        println()
    }
    println("Map successfully loaded!")

    return MapTiles(image.width, image.height, map)
}

private fun Int.isWall() = this == -16777216 // is black