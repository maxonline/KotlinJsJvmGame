package maxonline.client


import Phaser.Core.Config
import Phaser.Scene
import Phaser.Types.Core.GameConfig
import Phaser.Types.Scenes.CreateSceneFromObjectConfig
import Phaser.Types.Scenes.ScenePreloadCallback
import kotlinx.browser.document
import kotlinx.browser.window
import maxonline.shared.DeathCircle
import maxonline.shared.GameMessage
import maxonline.shared.Player
import maxonline.shared.PlayerMessage
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import kotlin.math.PI

val gameConainer: HTMLDivElement = document.getElementById("gameContainer") as HTMLDivElement
val network = Network("ws://" + document.location?.host) { onMessage(it) }

var scene = Scene("Demo")
scene.update() = {
    println(hej)
}

class MyConfig() : GameConfig{
    override var type: Number? = Phaser.AUTO
    override var parent: HTMLElement? = gameConainer
    override var width: Number? = 800
    override var height: Number? = 600
    override var scene: CreateSceneFromObjectConfig? = Scene()

    class Scene() : CreateSceneFromObjectConfig{
        override var preload: ScenePreloadCallback?
            get() = super.preload
            set(value) {}

    }
}

val game = Phaser.Game(config);

fun preload() {
    this.load.image("logo", logoImg);
}

function create() {
    const logo = this.add.image(400, 150, "logo");

    this.tweens.add({
        targets: logo,
        y: 450,
        duration: 2000,
        ease: "Power2",
        yoyo: true,
        loop: -1
    });
}
