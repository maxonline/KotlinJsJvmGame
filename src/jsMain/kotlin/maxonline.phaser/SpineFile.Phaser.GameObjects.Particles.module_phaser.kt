@file:JsQualifier("Phaser.GameObjects.Particles")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.GameObjects.Particles

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
import Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
import Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
import Phaser.Types.GameObjects.Particles.GravityWellConfig
import Phaser.Textures.Frame
import integer
import Phaser.Textures.Texture
import Phaser.Types.GameObjects.Particles.ParticleEmitterCallback
import Phaser.Types.GameObjects.Particles.ParticleDeathCallback
import Phaser.GameObjects.Particles.Zones.DeathZone
import Phaser.Geom.Rectangle
import Phaser.GameObjects.GameObject
import Phaser.Math.Vector2
import Phaser.Types.GameObjects.Particles.ParticleEmitterFrameConfig
import Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig
import Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig
import Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig
import Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig
import Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig
import Phaser.Types.GameObjects.Particles.ParticleEmitterBounds
import Phaser.Types.GameObjects.Particles.ParticleEmitterBoundsAlt
import Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
import Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
import Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig
import Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig
import Phaser.Types.GameObjects.Particles.ParticleEmitterDeathZoneConfig
import Phaser.BlendModes
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Components.BlendMode
import Phaser.GameObjects.Components.Mask
import Phaser.GameObjects.Components.ScrollFactor
import Phaser.GameObjects.Components.Visible
import Phaser.Scene
import Phaser.Structs.List
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.GameObjects.Components.Depth
import Phaser.GameObjects.Components.Pipeline
import Phaser.GameObjects.Components.Transform

external open class EmitterOp(config: ParticleEmitterConfig, key: String, defaultValue: Number, emitOnly: Boolean = definedExternally) {
    open var propertyKey: String
    open var propertyValue: Number
    open var defaultValue: Number
    open var steps: Number
    open var counter: Number
    open var start: Number
    open var end: Number
    open var ease: Function<*>
    open var emitOnly: Boolean
    open var onEmit: EmitterOpOnEmitCallback
    open var onUpdate: EmitterOpOnUpdateCallback
    open fun loadConfig(config: ParticleEmitterConfig = definedExternally, newKey: String = definedExternally)
    open fun toJSON(): Any?
    open fun onChange(value: Number): EmitterOp /* this */
    open fun setMethods(): EmitterOp /* this */
    open fun has(obj: Any?, key: String): Boolean
    open fun hasBoth(obj: Any?, key1: String, key2: String): Boolean
    open fun hasEither(obj: Any?, key1: String, key2: String): Boolean
    open fun defaultEmit(particle: Particle, key: String, value: Number = definedExternally): Number
    open fun defaultUpdate(particle: Particle, key: String, t: Number, value: Number): Number
    open fun staticValueEmit(): Number
    open fun staticValueUpdate(): Number
    open fun randomStaticValueEmit(): Number
    open fun randomRangedValueEmit(particle: Particle, key: String): Number
    open fun steppedEmit(): Number
    open fun easedValueEmit(particle: Particle, key: String): Number
    open fun easeValueUpdate(particle: Particle, key: String, t: Number): Number
}

external open class GravityWell {
    constructor(x: Number = definedExternally, y: Number = definedExternally, power: Number = definedExternally, epsilon: Number = definedExternally, gravity: Number = definedExternally)
    constructor()
    constructor(x: Number = definedExternally)
    constructor(x: Number = definedExternally, y: Number = definedExternally)
    constructor(x: Number = definedExternally, y: Number = definedExternally, power: Number = definedExternally)
    constructor(x: Number = definedExternally, y: Number = definedExternally, power: Number = definedExternally, epsilon: Number = definedExternally)
    constructor(x: GravityWellConfig = definedExternally, y: Number = definedExternally, power: Number = definedExternally, epsilon: Number = definedExternally, gravity: Number = definedExternally)
    constructor(x: GravityWellConfig = definedExternally)
    constructor(x: GravityWellConfig = definedExternally, y: Number = definedExternally)
    constructor(x: GravityWellConfig = definedExternally, y: Number = definedExternally, power: Number = definedExternally)
    constructor(x: GravityWellConfig = definedExternally, y: Number = definedExternally, power: Number = definedExternally, epsilon: Number = definedExternally)
    open var x: Number
    open var y: Number
    open var active: Boolean
    open var power: Number
    open var epsilon: Number
    open fun update(particle: Particle, delta: Number, step: Number)
}

external open class Particle(emitter: ParticleEmitter) {
    open var emitter: ParticleEmitter
    open var frame: Frame
    open var x: Number
    open var y: Number
    open var velocityX: Number
    open var velocityY: Number
    open var accelerationX: Number
    open var accelerationY: Number
    open var maxVelocityX: Number
    open var maxVelocityY: Number
    open var bounce: Number
    open var scaleX: Number
    open var scaleY: Number
    open var alpha: Number
    open var angle: Number
    open var rotation: Number
    open var tint: integer
    open var life: Number
    open var lifeCurrent: Number
    open var delayCurrent: Number
    open var lifeT: Number
    open var data: Any?
    open fun isAlive(): Boolean
    open fun resetPosition()
    open fun fire(x: Number, y: Number)
    open fun computeVelocity(emitter: ParticleEmitter, delta: Number, step: Number, processors: Array<Any>)
    open fun checkBounds(emitter: ParticleEmitter)
    open fun update(delta: Number, step: Number, processors: Array<Any>): Boolean
}

external open class ParticleEmitter(manager: ParticleEmitterManager, config: ParticleEmitterConfig) : BlendMode, Mask, ScrollFactor, Visible {
    open var manager: ParticleEmitterManager
    open var texture: Texture
    open var frames: Array<Frame>
    open var defaultFrame: Frame
    open var configFastMap: Any?
    open var configOpMap: Any?
    open var name: String
    open var particleClass: Particle
    open var x: EmitterOp
    open var y: EmitterOp
    open var radial: Boolean
    open var gravityX: Number
    open var gravityY: Number
    open var acceleration: Boolean
    open var accelerationX: EmitterOp
    open var accelerationY: EmitterOp
    open var maxVelocityX: EmitterOp
    open var maxVelocityY: EmitterOp
    open var speedX: EmitterOp
    open var speedY: EmitterOp
    open var moveTo: Boolean
    open var moveToX: EmitterOp
    open var moveToY: EmitterOp
    open var bounce: EmitterOp
    open var scaleX: EmitterOp
    open var scaleY: EmitterOp
    open var tint: EmitterOp
    open var alpha: EmitterOp
    open var lifespan: EmitterOp
    open var angle: EmitterOp
    open var rotate: EmitterOp
    open var emitCallback: ParticleEmitterCallback
    open var emitCallbackScope: Any
    open var deathCallback: ParticleDeathCallback
    open var deathCallbackScope: Any
    open var maxParticles: integer
    open var quantity: EmitterOp
    open var delay: EmitterOp
    open var frequency: Number
    open var on: Boolean
    open var particleBringToTop: Boolean
    open var timeScale: Number
    open var emitZone: dynamic /* Phaser.GameObjects.Particles.Zones.EdgeZone | Phaser.GameObjects.Particles.Zones.RandomZone */
    open var deathZone: DeathZone
    open var bounds: Rectangle
    open var collideLeft: Boolean
    open var collideRight: Boolean
    open var collideTop: Boolean
    open var collideBottom: Boolean
    open var active: Boolean
    override var visible: Boolean
    override var blendMode: integer
    open var follow: GameObject
    open var followOffset: Vector2
    open var trackVisible: Boolean
    open var currentFrame: integer
    open var randomFrame: Boolean
    open var frameQuantity: integer
    open fun fromJSON(config: ParticleEmitterConfig): ParticleEmitter /* this */
    open fun toJSON(output: Any? = definedExternally): Any?
    open fun startFollow(target: GameObject, offsetX: Number = definedExternally, offsetY: Number = definedExternally, trackVisible: Boolean = definedExternally): ParticleEmitter /* this */
    open fun stopFollow(): ParticleEmitter /* this */
    open fun getFrame(): Frame
    open fun setFrame(frames: Array<Any>, pickRandom: Boolean = definedExternally, quantity: integer = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: Array<Any>): ParticleEmitter /* this */
    open fun setFrame(frames: Array<Any>, pickRandom: Boolean = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: String, pickRandom: Boolean = definedExternally, quantity: integer = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: String): ParticleEmitter /* this */
    open fun setFrame(frames: String, pickRandom: Boolean = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: integer, pickRandom: Boolean = definedExternally, quantity: integer = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: integer): ParticleEmitter /* this */
    open fun setFrame(frames: integer, pickRandom: Boolean = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean = definedExternally, quantity: integer = definedExternally): ParticleEmitter /* this */
    open fun setFrame(frames: ParticleEmitterFrameConfig): ParticleEmitter /* this */
    open fun setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean = definedExternally): ParticleEmitter /* this */
    open fun setRadial(value: Boolean = definedExternally): ParticleEmitter /* this */
    open fun setPosition(x: Number, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: Array<Number>, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpOnEmitCallback, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpRandomConfig, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpRandomMinMaxConfig, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpRandomStartEndConfig, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpSteppedConfig, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setPosition(x: EmitterOpCustomEmitConfig, y: Any /* Number | Array<Number> | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig */): ParticleEmitter /* this */
    open fun setBounds(x: Number, y: Number, width: Number, height: Number): ParticleEmitter /* this */
    open fun setBounds(x: ParticleEmitterBounds, y: Number, width: Number, height: Number): ParticleEmitter /* this */
    open fun setBounds(x: ParticleEmitterBoundsAlt, y: Number, width: Number, height: Number): ParticleEmitter /* this */
    open fun setSpeedX(value: Number): ParticleEmitter /* this */
    open fun setSpeedX(value: Array<Number>): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setSpeedX(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setSpeedY(value: Number): ParticleEmitter /* this */
    open fun setSpeedY(value: Array<Number>): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setSpeedY(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setSpeed(value: Number): ParticleEmitter /* this */
    open fun setSpeed(value: Array<Number>): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setSpeed(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setScaleX(value: Number): ParticleEmitter /* this */
    open fun setScaleX(value: Array<Number>): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpOnUpdateCallback): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpEaseConfig): ParticleEmitter /* this */
    open fun setScaleX(value: EmitterOpCustomUpdateConfig): ParticleEmitter /* this */
    open fun setScaleY(value: Number): ParticleEmitter /* this */
    open fun setScaleY(value: Array<Number>): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpOnUpdateCallback): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpEaseConfig): ParticleEmitter /* this */
    open fun setScaleY(value: EmitterOpCustomUpdateConfig): ParticleEmitter /* this */
    open fun setScale(value: Number): ParticleEmitter /* this */
    open fun setScale(value: Array<Number>): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpOnUpdateCallback): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpEaseConfig): ParticleEmitter /* this */
    open fun setScale(value: EmitterOpCustomUpdateConfig): ParticleEmitter /* this */
    open fun setGravityX(value: Number): ParticleEmitter /* this */
    open fun setGravityY(value: Number): ParticleEmitter /* this */
    open fun setGravity(x: Number, y: Number): ParticleEmitter /* this */
    open fun setAlpha(value: Number): ParticleEmitter /* this */
    open fun setAlpha(value: Array<Number>): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpOnUpdateCallback): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpEaseConfig): ParticleEmitter /* this */
    open fun setAlpha(value: EmitterOpCustomUpdateConfig): ParticleEmitter /* this */
    open fun setTint(value: Number): ParticleEmitter /* this */
    open fun setTint(value: Array<Number>): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpOnUpdateCallback): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpEaseConfig): ParticleEmitter /* this */
    open fun setTint(value: EmitterOpCustomUpdateConfig): ParticleEmitter /* this */
    open fun setEmitterAngle(value: Number): ParticleEmitter /* this */
    open fun setEmitterAngle(value: Array<Number>): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setEmitterAngle(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setAngle(value: Number): ParticleEmitter /* this */
    open fun setAngle(value: Array<Number>): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setAngle(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setLifespan(value: Number): ParticleEmitter /* this */
    open fun setLifespan(value: Array<Number>): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setLifespan(value: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setQuantity(quantity: Number): ParticleEmitter /* this */
    open fun setQuantity(quantity: Array<Number>): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpOnEmitCallback): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpRandomConfig): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpRandomMinMaxConfig): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpRandomStartEndConfig): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpSteppedConfig): ParticleEmitter /* this */
    open fun setQuantity(quantity: EmitterOpCustomEmitConfig): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: Number = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: Array<Number> = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpOnEmitCallback = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpRandomConfig = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpRandomMinMaxConfig = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpRandomStartEndConfig = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpSteppedConfig = definedExternally): ParticleEmitter /* this */
    open fun setFrequency(frequency: Number, quantity: EmitterOpCustomEmitConfig = definedExternally): ParticleEmitter /* this */
    open fun setEmitZone(zoneConfig: ParticleEmitterEdgeZoneConfig = definedExternally): ParticleEmitter /* this */
    open fun setEmitZone(): ParticleEmitter /* this */
    open fun setEmitZone(zoneConfig: ParticleEmitterRandomZoneConfig = definedExternally): ParticleEmitter /* this */
    open fun setDeathZone(zoneConfig: ParticleEmitterDeathZoneConfig = definedExternally): ParticleEmitter /* this */
    open fun reserve(particleCount: integer): ParticleEmitter /* this */
    open fun getAliveParticleCount(): integer
    open fun getDeadParticleCount(): integer
    open fun getParticleCount(): integer
    open fun atLimit(): Boolean
    open fun onParticleEmit(callback: ParticleEmitterCallback, context: Any = definedExternally): ParticleEmitter /* this */
    open fun onParticleDeath(callback: ParticleDeathCallback, context: Any = definedExternally): ParticleEmitter /* this */
    open fun killAll(): ParticleEmitter /* this */
    open fun forEachAlive(callback: ParticleEmitterCallback, context: Any): ParticleEmitter /* this */
    open fun forEachDead(callback: ParticleEmitterCallback, context: Any): ParticleEmitter /* this */
    open fun start(): ParticleEmitter /* this */
    open fun stop(): ParticleEmitter /* this */
    open fun pause(): ParticleEmitter /* this */
    open fun resume(): ParticleEmitter /* this */
    open fun remove(): ParticleEmitter /* this */
    open fun depthSort(): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: Number = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: Array<Number> = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpOnEmitCallback = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpRandomConfig = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpRandomMinMaxConfig = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpRandomStartEndConfig = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpSteppedConfig = definedExternally): ParticleEmitter /* this */
    open fun flow(frequency: Number, count: EmitterOpCustomEmitConfig = definedExternally): ParticleEmitter /* this */
    open fun explode(count: integer, x: Number, y: Number): Particle
    open fun emitParticleAt(x: Number = definedExternally, y: Number = definedExternally, count: integer = definedExternally): Particle
    open fun emitParticle(count: integer = definedExternally, x: Number = definedExternally, y: Number = definedExternally): Particle
    open fun preUpdate(time: integer, delta: Number)
    open fun depthSortCallback(a: Any?, b: Any?): integer
    override fun setBlendMode(value: String): dynamic /* ParticleEmitter | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* ParticleEmitter | BlendMode */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* ParticleEmitter | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* ParticleEmitter | Mask */
    override fun clearMask(destroyMask: Boolean): ParticleEmitter /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): ParticleEmitter /* this */
    override fun setVisible(value: Boolean): ParticleEmitter /* this */
}

external open class ParticleEmitterManager : GameObject, Depth, Mask, Pipeline, Transform, Visible {
    constructor(scene: Scene, texture: String, frame: String = definedExternally, emitters: ParticleEmitterConfig = definedExternally)
    constructor(scene: Scene, texture: String)
    constructor(scene: Scene, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, texture: String, frame: String = definedExternally, emitters: Array<ParticleEmitterConfig> = definedExternally)
    constructor(scene: Scene, texture: String, frame: integer = definedExternally, emitters: ParticleEmitterConfig = definedExternally)
    constructor(scene: Scene, texture: String, frame: integer = definedExternally)
    constructor(scene: Scene, texture: String, frame: integer = definedExternally, emitters: Array<ParticleEmitterConfig> = definedExternally)
    open var timeScale: Number
    open var texture: Texture
    open var frame: Frame
    open var frameNames: Array<String>
    open var emitters: List<ParticleEmitter>
    open var wells: List<GravityWell>
    open fun setTexture(key: String, frame: String = definedExternally): ParticleEmitterManager /* this */
    open fun setTexture(key: String): ParticleEmitterManager /* this */
    open fun setTexture(key: String, frame: integer = definedExternally): ParticleEmitterManager /* this */
    open fun setFrame(frame: String = definedExternally): ParticleEmitterManager /* this */
    open fun setFrame(): ParticleEmitterManager /* this */
    open fun setFrame(frame: integer = definedExternally): ParticleEmitterManager /* this */
    open fun setEmitterFrames(frames: Frame, emitter: ParticleEmitter): ParticleEmitterManager /* this */
    open fun setEmitterFrames(frames: Array<Frame>, emitter: ParticleEmitter): ParticleEmitterManager /* this */
    open fun addEmitter(emitter: ParticleEmitter): ParticleEmitter
    open fun createEmitter(config: ParticleEmitterConfig): ParticleEmitter
    open fun removeEmitter(emitter: ParticleEmitter): ParticleEmitter
    open fun addGravityWell(well: GravityWell): GravityWell
    open fun createGravityWell(config: GravityWellConfig): GravityWell
    open fun emitParticle(count: integer = definedExternally, x: Number = definedExternally, y: Number = definedExternally): ParticleEmitterManager /* this */
    open fun emitParticleAt(x: Number = definedExternally, y: Number = definedExternally, count: integer = definedExternally): ParticleEmitterManager /* this */
    open fun pause(): ParticleEmitterManager /* this */
    open fun resume(): ParticleEmitterManager /* this */
    open fun getProcessors(): Array<GravityWell>
    open fun preUpdate(time: integer, delta: Number)
    override var depth: Number
    override fun setDepth(value: integer): ParticleEmitterManager /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* ParticleEmitterManager | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* ParticleEmitterManager | Mask */
    override fun clearMask(destroyMask: Boolean): ParticleEmitterManager /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): ParticleEmitterManager /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): ParticleEmitterManager /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): ParticleEmitterManager /* this */
    override fun setRotation(radians: Number): ParticleEmitterManager /* this */
    override fun setAngle(degrees: Number): ParticleEmitterManager /* this */
    override fun setScale(x: Number, y: Number): ParticleEmitterManager /* this */
    override fun setX(value: Number): ParticleEmitterManager /* this */
    override fun setY(value: Number): ParticleEmitterManager /* this */
    override fun setZ(value: Number): ParticleEmitterManager /* this */
    override fun setW(value: Number): ParticleEmitterManager /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): ParticleEmitterManager /* this */
}