package maxonline.client


import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.get

@ExperimentalUnsignedTypes
fun main() {
    val canvas: HTMLCanvasElement = document.getElementsByClassName("gameCanvas")[0] as HTMLCanvasElement
    canvas.width = 800
    canvas.height = 600
    val context: CanvasRenderingContext2D = canvas.getContext("2d") as CanvasRenderingContext2D

    context.moveTo(0.0, 0.0)
    context.lineTo(600.0, 500.0)
    context.stroke()

    window.onload = {
        play();
        println("hej")
    }
}

fun play() {
    println("play")

}
