@file:JsQualifier("Phaser.Plugins")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Plugins

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
import Phaser.Game
import Phaser.Types.Plugins.GlobalPlugin
import Phaser.Scenes.Systems
import Phaser.Scene
import integer

external open class BasePlugin(pluginManager: PluginManager) {
    open var pluginManager: PluginManager
    open var game: Game
    open fun init(data: Any = definedExternally)
    open fun start()
    open fun stop()
    open fun destroy()
}

external interface DefaultPlugins {
    var Global: Array<Any>
    var CoreScene: Array<Any>
    var DefaultScene: Array<Any>
}

external var Global: Array<Any>

external var CoreScene: Array<Any>

external var DefaultScene: Array<Any>

external open class PluginManager(game: Game) {
    open var game: Game
    open var plugins: Array<GlobalPlugin>
    open var scenePlugins: Array<String>
    open fun boot()
    open fun addToScene(sys: Systems, globalPlugins: Array<Any>, scenePlugins: Array<Any>)
    open fun getDefaultScenePlugins(): Array<String>
    open fun installScenePlugin(key: String, plugin: Function<*>, mapping: String = definedExternally, addToScene: Scene = definedExternally, fromLoader: Boolean = definedExternally)
    open fun install(key: String, plugin: Function<*>, start: Boolean = definedExternally, mapping: String = definedExternally, data: Any = definedExternally): BasePlugin
    open fun getIndex(key: String): integer
    open fun getEntry(key: String): GlobalPlugin
    open fun isActive(key: String): Boolean
    open fun start(key: String, runAs: String = definedExternally): BasePlugin
    open fun stop(key: String): PluginManager /* this */
    open fun get(key: String, autoStart: Boolean = definedExternally): dynamic /* Phaser.Plugins.BasePlugin | Function<*> */
    open fun getClass(key: String): BasePlugin
    open fun removeGlobalPlugin(key: String)
    open fun removeScenePlugin(key: String)
    open fun registerGameObject(key: String, factoryCallback: Function<*> = definedExternally, creatorCallback: Function<*> = definedExternally)
    open fun removeGameObject(key: String, removeFromFactory: Boolean = definedExternally, removeFromCreator: Boolean = definedExternally)
    open fun registerFileType(key: String, callback: Function<*>, addToScene: Scene = definedExternally)
    open fun destroy()
}

external open class ScenePlugin(scene: Scene, pluginManager: PluginManager) : BasePlugin {
    open var scene: Scene
    open var systems: Systems
    open fun boot()
    override fun destroy()
}