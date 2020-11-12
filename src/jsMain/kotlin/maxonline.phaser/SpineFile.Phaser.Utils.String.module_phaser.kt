@file:JsQualifier("Phaser.Utils.String")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Utils.String

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

external fun Format(string: String, values: Array<Any>): String

external fun Pad(str: String?, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Pad(str: String?): String

external fun Pad(str: String?, len: integer = definedExternally): String

external fun Pad(str: String?, len: integer = definedExternally, pad: String = definedExternally): String

external fun Pad(str: Number?, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Pad(str: Number?): String

external fun Pad(str: Number?, len: integer = definedExternally): String

external fun Pad(str: Number?, len: integer = definedExternally, pad: String = definedExternally): String

external fun Pad(str: Any?, len: integer = definedExternally, pad: String = definedExternally, dir: integer = definedExternally): String

external fun Pad(str: Any?): String

external fun Pad(str: Any?, len: integer = definedExternally): String

external fun Pad(str: Any?, len: integer = definedExternally, pad: String = definedExternally): String

external fun Reverse(string: String): String

external fun UppercaseFirst(str: String): String

external fun UUID(): String