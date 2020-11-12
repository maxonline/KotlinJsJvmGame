@file:JsQualifier("Phaser.Utils.Objects")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Utils.Objects

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

external fun Clone(obj: Any?): Any?

external fun Extend(vararg args: Any): Any?

external fun GetAdvancedValue(source: Any?, key: String, defaultValue: Any): Any

external fun GetFastValue(source: Any?, key: String, defaultValue: Any = definedExternally): Any

external fun GetMinMaxValue(source: Any?, key: String, min: Number, max: Number, defaultValue: Number): Number

external fun GetValue(source: Any?, key: String, defaultValue: Any): Any

external fun HasAll(source: Any?, keys: Array<String>): Boolean

external fun HasAny(source: Any?, keys: Array<String>): Boolean

external fun HasValue(source: Any?, key: String): Boolean

external fun IsPlainObject(obj: Any?): Boolean

external fun Merge(obj1: Any?, obj2: Any?): Any?

external fun MergeRight(obj1: Any?, obj2: Any?): Any?

external fun Pick(obj: Any?, keys: Array<Any>): Any?

external fun SetValue(source: Any?, key: String, value: Any): Boolean