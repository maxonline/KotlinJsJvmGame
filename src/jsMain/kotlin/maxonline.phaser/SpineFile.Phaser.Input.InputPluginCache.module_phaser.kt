@file:JsQualifier("Phaser.Input.InputPluginCache")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Input.InputPluginCache

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
import Phaser.Types.Input.InputPluginContainer
import Phaser.Input.InputPlugin

external fun register(key: String, plugin: Function<*>, mapping: String, settingsKey: String, configKey: String)

external fun getCore(key: String): InputPluginContainer

external fun install(target: InputPlugin)

external fun remove(key: String)