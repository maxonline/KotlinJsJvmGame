@file:JsQualifier("Phaser.Physics.Matter.Events")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Physics.Matter.Events

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
import Phaser.Types.Physics.Matter.MatterCollisionData

external interface AfterAddEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var AFTER_ADD: Any

external interface AfterRemoveEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var AFTER_REMOVE: Any

external interface AfterUpdateEvent {
    var timestamp: Number
    var source: Any
    var name: String
}

external var AFTER_UPDATE: Any

external interface BeforeAddEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var BEFORE_ADD: Any

external interface BeforeRemoveEvent {
    var `object`: Array<Any>
    var source: Any
    var name: String
}

external var BEFORE_REMOVE: Any

external interface BeforeUpdateEvent {
    var timestamp: Number
    var source: Any
    var name: String
}

external var BEFORE_UPDATE: Any

external interface CollisionActiveEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_ACTIVE: Any

external interface CollisionEndEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_END: Any

external interface CollisionStartEvent {
    var pairs: Array<MatterCollisionData>
    var timestamp: Number
    var source: Any
    var name: String
}

external var COLLISION_START: Any

external var DRAG_END: Any

external var DRAG: Any

external var DRAG_START: Any

external var PAUSE: Any

external var RESUME: Any

external interface SleepEndEvent {
    var source: Any
    var name: String
}

external var SLEEP_END: Any

external interface SleepStartEvent {
    var source: Any
    var name: String
}

external var SLEEP_START: Any