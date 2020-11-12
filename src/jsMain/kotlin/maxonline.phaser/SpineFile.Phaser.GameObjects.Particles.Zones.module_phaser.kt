@file:JsQualifier("Phaser.GameObjects.Particles.Zones")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.GameObjects.Particles.Zones

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
import Phaser.Types.GameObjects.Particles.DeathZoneSource
import Phaser.GameObjects.Particles.Particle
import Phaser.Types.GameObjects.Particles.EdgeZoneSource
import integer
import Phaser.Geom.Point
import Phaser.Types.GameObjects.Particles.RandomZoneSource

external open class DeathZone(source: DeathZoneSource, killOnEnter: Boolean) {
    open var source: DeathZoneSource
    open var killOnEnter: Boolean
    open fun willKill(particle: Particle): Boolean
}

external open class EdgeZone(source: EdgeZoneSource, quantity: integer, stepRate: Number, yoyo: Boolean = definedExternally, seamless: Boolean = definedExternally) {
    open var source: dynamic /* Phaser.Types.GameObjects.Particles.EdgeZoneSource | Phaser.Types.GameObjects.Particles.RandomZoneSource */
    open var points: Array<Point>
    open var quantity: integer
    open var stepRate: Number
    open var yoyo: Boolean
    open var counter: Number
    open var seamless: Boolean
    open fun updateSource(): EdgeZone /* this */
    open fun changeSource(source: EdgeZoneSource): EdgeZone /* this */
    open fun getPoint(particle: Particle)
}

external open class RandomZone(source: RandomZoneSource) {
    open var source: RandomZoneSource
    open fun getPoint(particle: Particle)
}