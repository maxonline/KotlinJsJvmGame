@file:JsQualifier("Phaser.Scenes")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Scenes

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
import integer
import Phaser.Game
import Phaser.Scene
import Phaser.Types.Scenes.SettingsConfig
import Phaser.Types.Scenes.CreateSceneFromObjectConfig
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Types.Scenes.SettingsObject
import Phaser.Types.Scenes.SceneTransitionConfig
import Phaser.FacebookInstantGamesPlugin
import Phaser.Animations.AnimationManager
import Phaser.Cache.CacheManager
import Phaser.Plugins.PluginManager
import Phaser.Data.DataManager
import Phaser.Scale.ScaleManager
import Phaser.Textures.TextureManager
import Phaser.GameObjects.GameObjectFactory
import Phaser.Cameras.Scene2D.CameraManager
import Phaser.GameObjects.DisplayList
import Phaser.Events.EventEmitter
import Phaser.GameObjects.GameObjectCreator
import Phaser.GameObjects.UpdateList

external var PENDING: integer

external var INIT: integer

external var START: integer

external var LOADING: integer

external var CREATING: integer

external var RUNNING: integer

external var PAUSED: integer

external var SLEEPING: integer

external var SHUTDOWN: integer

external var DESTROYED: integer

external fun GetPhysicsPlugins(sys: Systems): Array<Any>

external fun GetScenePlugins(sys: Systems): Array<Any>

external open class SceneManager(game: Game, sceneConfig: Any?) {
    open var game: Game
    open var keys: Any?
    open var scenes: Array<Any>
    open var isProcessing: Boolean
    open var isBooted: Boolean
    open var customViewports: Number
    open fun processQueue()
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean = definedExternally, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: Scene): Scene
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean = definedExternally): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean = definedExternally, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: SettingsConfig): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean = definedExternally, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean = definedExternally, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: Function<*>): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean = definedExternally): Scene
    open fun remove(key: String): SceneManager
    open fun update(time: Number, delta: Number)
    open fun render(renderer: CanvasRenderer)
    open fun render(renderer: WebGLRenderer)
    open fun getScenes(isActive: Boolean = definedExternally, inReverse: Boolean = definedExternally): Array<Scene>
    open fun getScene(key: String): Scene
    open fun getScene(key: Scene): Scene
    open fun isActive(key: String): Boolean
    open fun isPaused(key: String): Boolean
    open fun isVisible(key: String): Boolean
    open fun isSleeping(key: String): Boolean
    open fun pause(key: String, data: Any? = definedExternally): SceneManager
    open fun resume(key: String, data: Any? = definedExternally): SceneManager
    open fun sleep(key: String, data: Any? = definedExternally): SceneManager
    open fun wake(key: String, data: Any? = definedExternally): SceneManager
    open fun run(key: String, data: Any? = definedExternally): SceneManager
    open fun start(key: String, data: Any? = definedExternally): SceneManager
    open fun stop(key: String, data: Any? = definedExternally): SceneManager
    open fun switch(from: String, to: String): SceneManager
    open fun getAt(index: integer): Scene?
    open fun getIndex(key: String): integer
    open fun getIndex(key: Scene): integer
    open fun bringToTop(key: String): SceneManager
    open fun bringToTop(key: Scene): SceneManager
    open fun sendToBack(key: String): SceneManager
    open fun sendToBack(key: Scene): SceneManager
    open fun moveDown(key: String): SceneManager
    open fun moveDown(key: Scene): SceneManager
    open fun moveUp(key: String): SceneManager
    open fun moveUp(key: Scene): SceneManager
    open fun moveAbove(keyA: String, keyB: String): SceneManager
    open fun moveAbove(keyA: String, keyB: Scene): SceneManager
    open fun moveAbove(keyA: Scene, keyB: String): SceneManager
    open fun moveAbove(keyA: Scene, keyB: Scene): SceneManager
    open fun moveBelow(keyA: String, keyB: String): SceneManager
    open fun moveBelow(keyA: String, keyB: Scene): SceneManager
    open fun moveBelow(keyA: Scene, keyB: String): SceneManager
    open fun moveBelow(keyA: Scene, keyB: Scene): SceneManager
    open fun swapPosition(keyA: String, keyB: String): SceneManager
    open fun swapPosition(keyA: String, keyB: Scene): SceneManager
    open fun swapPosition(keyA: Scene, keyB: String): SceneManager
    open fun swapPosition(keyA: Scene, keyB: Scene): SceneManager
    open fun dump()
    open fun destroy()
}

external open class ScenePlugin(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var settings: SettingsObject
    open var key: String
    open var manager: SceneManager
    open var transitionProgress: Number
    open fun start(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun restart(data: Any? = definedExternally): ScenePlugin
    open fun transition(config: SceneTransitionConfig): Boolean
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean, data: Any? = definedExternally): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean): Scene
    open fun launch(key: String, data: Any? = definedExternally): ScenePlugin
    open fun run(key: String, data: Any? = definedExternally): ScenePlugin
    open fun pause(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun resume(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun sleep(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun wake(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun switch(key: String): ScenePlugin
    open fun stop(key: String = definedExternally, data: Any = definedExternally): ScenePlugin
    open fun setActive(value: Boolean, key: String = definedExternally, data: Any? = definedExternally): ScenePlugin
    open fun setVisible(value: Boolean, key: String = definedExternally): ScenePlugin
    open fun isSleeping(key: String = definedExternally): Boolean
    open fun isActive(key: String = definedExternally): Boolean
    open fun isPaused(key: String = definedExternally): Boolean
    open fun isVisible(key: String = definedExternally): Boolean
    open fun swapPosition(keyA: String, keyB: String = definedExternally): ScenePlugin
    open fun moveAbove(keyA: String, keyB: String = definedExternally): ScenePlugin
    open fun moveBelow(keyA: String, keyB: String = definedExternally): ScenePlugin
    open fun remove(key: String = definedExternally): SceneManager
    open fun remove(): SceneManager
    open fun remove(key: Scene = definedExternally): SceneManager
    open fun moveUp(key: String = definedExternally): ScenePlugin
    open fun moveDown(key: String = definedExternally): ScenePlugin
    open fun bringToTop(key: String = definedExternally): ScenePlugin
    open fun sendToBack(key: String = definedExternally): ScenePlugin
    open fun get(key: String): Scene
    open fun getIndex(key: String = definedExternally): integer
    open fun getIndex(): integer
    open fun getIndex(key: Scene = definedExternally): integer
}

external open class Systems {
    constructor(scene: Scene, config: String)
    constructor(scene: Scene, config: SettingsConfig)
    open var scene: Scene
    open var game: Game
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var facebook: FacebookInstantGamesPlugin
    open var config: dynamic /* String | Phaser.Types.Scenes.SettingsConfig */
    open var settings: SettingsObject
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var anims: AnimationManager
    open var cache: CacheManager
    open var plugins: PluginManager
    open var registry: DataManager
    open var scale: ScaleManager
    open var sound: dynamic /* Phaser.Sound.NoAudioSoundManager | Phaser.Sound.HTML5AudioSoundManager | Phaser.Sound.WebAudioSoundManager */
    open var textures: TextureManager
    open var add: GameObjectFactory
    open var cameras: CameraManager
    open var displayList: DisplayList
    open var events: EventEmitter
    open var make: GameObjectCreator
    open var scenePlugin: ScenePlugin
    open var updateList: UpdateList
    open fun init(game: Game)
    open fun step(time: Number, delta: Number)
    open fun render(renderer: CanvasRenderer)
    open fun render(renderer: WebGLRenderer)
    open fun queueDepthSort()
    open fun depthSort()
    open fun pause(data: Any? = definedExternally): Systems
    open fun resume(data: Any? = definedExternally): Systems
    open fun sleep(data: Any? = definedExternally): Systems
    open fun wake(data: Any? = definedExternally): Systems
    open fun getData(): Any
    open fun isSleeping(): Boolean
    open fun isActive(): Boolean
    open fun isPaused(): Boolean
    open fun isTransitioning(): Boolean
    open fun isTransitionOut(): Boolean
    open fun isTransitionIn(): Boolean
    open fun isVisible(): Boolean
    open fun setVisible(value: Boolean): Systems
    open fun setActive(value: Boolean, data: Any? = definedExternally): Systems
    open fun start(data: Any?)
    open fun shutdown(data: Any? = definedExternally)
}