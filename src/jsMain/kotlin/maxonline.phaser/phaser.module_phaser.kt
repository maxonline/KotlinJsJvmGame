@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.Bob
import Phaser.GameObjects.Light
import Phaser.GameObjects.Text
import Phaser.Geom.Triangle
import Phaser.Types.Physics.Arcade.GameObjectWithBody
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Textures.Texture
import Phaser.Tilemaps.Tile
import Phaser.GameObjects.GameObject

typealias CameraRotateCallback = (camera: Camera, progress: Number, angle: Number) -> Unit

typealias DataEachCallback = (parent: Any, key: String, value: Any, args: Any) -> Unit

typealias ContentLoadedCallback = () -> Unit

typealias CreateCallback = (bob: Bob, index: integer) -> Unit

typealias EachContainerCallback<I> = (item: Any, args: Any) -> Unit

typealias LightForEach = (light: Light) -> Unit

typealias TextStyleWordWrapCallback = (text: String, textObject: Text) -> Unit

typealias CenterFunction = (triangle: Triangle) -> Unit

typealias ArcadePhysicsCallback = (object1: GameObjectWithBody, object2: GameObjectWithBody) -> Unit

typealias WebGLContextCallback = (renderer: WebGLRenderer) -> Unit

typealias EachListCallback<I> = (item: I, args: Any) -> Unit

typealias EachMapCallback<E> = (key: String, entry: E) -> Unit

typealias EachSetCallback<E> = (entry: E, index: Number) -> Unit

typealias EachTextureCallback = (texture: Texture, args: Any) -> Unit

typealias FindTileCallback = (value: Tile, index: integer, array: Array<Tile>) -> Unit

typealias EachTileCallback = (value: Tile, index: integer, array: Array<Tile>) -> Unit

typealias TilemapFilterCallback = (value: GameObject, index: Number, array: Array<GameObject>) -> Unit

typealias TilemapFindCallback = (value: GameObject, index: Number, array: Array<GameObject>) -> Unit

external fun extend(ctor: Any, definition: Any, isClassDescriptor: Boolean, extend: Any = definedExternally)

external fun mixin(myClass: Any, mixins: Any)

external fun mixin(myClass: Any, mixins: Array<Any>)

external open class Class(definition: Any)

external interface AdInstance {
    var instance: Any
    var placementID: String
    var shown: Boolean
    var video: Boolean
}

typealias ContextFilter = String

external interface ChooseContextConfig {
    var filters: Array<ContextFilter>?
        get() = definedExternally
        set(value) = definedExternally
    var maxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LeaderboardScore {
    var score: integer
    var scoreFormatted: String
    var timestamp: integer
    var rank: integer
    var data: String
    var playerName: String
    var playerPhotoURL: String
    var playerID: String
}

external interface Product {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var productID: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var imageURI: String?
        get() = definedExternally
        set(value) = definedExternally
    var price: String?
        get() = definedExternally
        set(value) = definedExternally
    var priceCurrencyCode: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Purchase {
    var developerPayload: String?
        get() = definedExternally
        set(value) = definedExternally
    var paymentID: String?
        get() = definedExternally
        set(value) = definedExternally
    var productID: String?
        get() = definedExternally
        set(value) = definedExternally
    var purchaseTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var purchaseToken: String?
        get() = definedExternally
        set(value) = definedExternally
    var signedRequest: String?
        get() = definedExternally
        set(value) = definedExternally
}

typealias integer = Number