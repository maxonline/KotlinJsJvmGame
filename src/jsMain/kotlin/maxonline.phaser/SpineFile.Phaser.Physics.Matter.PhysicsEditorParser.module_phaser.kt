@file:JsQualifier("Phaser.Physics.Matter.PhysicsEditorParser")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Physics.Matter.PhysicsEditorParser

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
import Phaser.Types.Physics.Matter.MatterBodyConfig
import MatterJS.BodyType

external fun parseBody(x: Number, y: Number, config: Any?, options: MatterBodyConfig = definedExternally): BodyType

external fun parseFixture(fixtureConfig: Any?): Array<BodyType>

external fun parseVertices(vertexSets: Array<Any>, options: MatterBodyConfig = definedExternally): Array<BodyType>