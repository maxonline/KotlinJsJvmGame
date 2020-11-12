@file:JsQualifier("Phaser.Plugins.PluginCache")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Plugins.PluginCache

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
import Phaser.Types.Plugins.CorePluginContainer
import Phaser.Types.Plugins.CustomPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, custom: Boolean = definedExternally)

external fun registerCustom(key: String, plugin: Function<*>, mapping: String, data: Any)

external fun hasCore(key: String): Boolean

external fun hasCustom(key: String): Boolean

external fun getCore(key: String): CorePluginContainer

external fun getCustom(key: String): CustomPluginContainer

external fun getCustomClass(key: String): Function<*>

external fun remove(key: String)

external fun removeCustom(key: String)

external fun destroyCorePlugins()

external fun destroyCustomPlugins()