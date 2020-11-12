@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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
import Phaser.Scene
import spine.Bone
import spine.Skeleton
import spine.SkeletonData
import spine.AnimationState
import spine.AnimationStateData
import spine.TrackEntry
import spine.Animation
import spine.EventData
import spine.IkConstraintData
import spine.PathConstraintData
import spine.Skin
import spine.Slot
import spine.TransformConstraintData
import spine.Attachment
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Components.ComputedSize
import Phaser.GameObjects.Components.Depth
import Phaser.GameObjects.Components.Flip
import Phaser.GameObjects.Components.ScrollFactor
import Phaser.GameObjects.Components.Transform
import Phaser.GameObjects.Components.Visible
import Phaser.Types.GameObjects.GameObjectConfig

external open class SpineGameObject(
    scene: Scene,
    pluginManager: SpinePlugin,
    x: Number,
    y: Number,
    key: String = definedExternally,
    animationName: String = definedExternally,
    loop: Boolean = definedExternally
) : GameObject, Depth, Flip, ScrollFactor, Transform, Visible {
    open var alpha: Number
    override var angle: Number
    open var blendMode: Number
    open var blue: Number
    open var bounds: Any
    open var displayOriginX: Number
    open var displayOriginY: Number
    open var drawDebug: Boolean
    override var depth: Number
    open var displayWidth: Number
    open var displayHeight: Number
    override var flipX: Boolean
    override var flipY: Boolean
    open var green: Number
    open var height: Number
    open var plugin: SpinePlugin
    open var preMultipliedAlpha: Boolean
    open var red: Number
    open var root: Bone
    override var rotation: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    open var skeleton: Skeleton
    open var skeletonData: SkeletonData
    override var state: AnimationState
    open var stateData: AnimationStateData
    open var timeScale: Number
    override var visible: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    open var width: Number
    open fun addAnimation(trackIndex: Number, animationName: String, loop: Boolean = definedExternally, delay: Number = definedExternally): TrackEntry
    open fun angleBoneToXY(bone: Bone, worldX: Number, worldY: Number, offset: Number = definedExternally, minAngle: Number = definedExternally, maxAngle: Number = definedExternally): SpineGameObject
    open fun clearTrack(trackIndex: Number): SpineGameObject
    open fun clearTracks(): SpineGameObject
    open fun findAnimation(animationName: String): Animation
    open fun findBone(boneName: String): Bone
    open fun findBoneIndex(boneName: String): Number
    open fun findEvent(eventDataName: String): EventData
    open fun findIkConstraint(constraintName: String): IkConstraintData
    open fun findPathConstraint(constraintName: String): PathConstraintData
    open fun findPathConstraintIndex(constraintName: String): Number
    open fun findSkin(skinName: String): Skin
    open fun findSlot(slotName: String): Slot
    open fun findSlotIndex(slotName: String): Number
    open fun findTransformConstraint(constraintName: String): TransformConstraintData
    open fun getAnimationList(): Array<String>
    open fun getAttachment(slotIndex: Number, attachmentName: String): Attachment
    open fun getAttachmentByName(slotName: String, attachmentName: String): Attachment
    open fun getBoneList(): Array<String>
    open fun getBounds(): Any
    open fun getCurrentAnimation(trackIndex: Number = definedExternally): Animation
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    open fun getRootBone(): Bone
    open fun getSkinList(): Array<String>
    open fun getSlotList(): Array<String>
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    open fun play(animationName: String, loop: Boolean = definedExternally, ignoreIfPlaying: Boolean = definedExternally): SpineGameObject
    open fun preUpdate(time: Number, delta: Number)
    open fun preDestroy()
    open fun refresh(): SpineGameObject
    override fun resetFlip(): SpineGameObject /* this */
    open fun setAlpha(value: Number = definedExternally): SpineGameObject
    override fun setAngle(degrees: Number): SpineGameObject /* this */
    open fun setAnimation(trackIndex: Number, animationName: String, loop: Boolean = definedExternally, ignoreIfPlaying: Boolean = definedExternally): TrackEntry
    open fun setAttachment(slotName: String, attachmentName: String): SpineGameObject
    open fun setBonesToSetupPose(): SpineGameObject
    open fun setColor(color: Number = definedExternally, slotName: String = definedExternally): SpineGameObject
    override fun setDepth(value: Number): SpineGameObject /* this */
    open fun setDisplaySize(width: Number, height: Number): SpineGameObject /* this */
    open fun setEmptyAnimation(trackIndex: Number, mixDuration: Number = definedExternally): TrackEntry
    override fun setFlipX(value: Boolean): SpineGameObject /* this */
    override fun setFlipY(value: Boolean): SpineGameObject /* this */
    override fun setFlip(x: Boolean, y: Boolean): SpineGameObject /* this */
    open fun setMix(fromName: String, toName: String, duration: Number = definedExternally): SpineGameObject
    open fun setOffset(offsetX: Number = definedExternally, offsetY: Number = definedExternally): SpineGameObject
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): SpineGameObject /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): SpineGameObject /* this */
    override fun setRotation(radians: Number): SpineGameObject /* this */
    override fun setScale(x: Number, y: Number): SpineGameObject /* this */
    override fun setScrollFactor(x: Number, y: Number): SpineGameObject /* this */
    open fun setSize(width: Number = definedExternally, height: Number = definedExternally, offsetX: Number = definedExternally, offsetY: Number = definedExternally): SpineGameObject
    open fun setSkeleton(atlasDataKey: String, skeletonJSON: Any?, animationName: String = definedExternally, loop: Boolean = definedExternally): SpineGameObject
    open fun setSkeletonFromJSON(atlasDataKey: String, skeletonJSON: Any?, animationName: String = definedExternally, loop: Boolean = definedExternally): SpineGameObject
    open fun setSkin(newSkin: Skin): SpineGameObject
    open fun setSkinByName(skinName: String): SpineGameObject
    open fun setSlotsToSetupPose(): SpineGameObject
    open fun setToSetupPose(): SpineGameObject
    override fun setVisible(value: Boolean): SpineGameObject /* this */
    override fun setX(value: Number): SpineGameObject /* this */
    override fun setY(value: Number): SpineGameObject /* this */
    override fun setZ(value: Number): SpineGameObject /* this */
    override fun setW(value: Number): SpineGameObject /* this */
    override fun toggleFlipX(): SpineGameObject /* this */
    override fun toggleFlipY(): SpineGameObject /* this */
    open fun updateSize(): SpineGameObject
    open fun willRender(): Boolean
}

external interface SpineGameObjectConfig : GameObjectConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var animationName: String?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var skinName: String?
        get() = definedExternally
        set(value) = definedExternally
    var slotName: String?
        get() = definedExternally
        set(value) = definedExternally
    var attachmentName: String?
        get() = definedExternally
        set(value) = definedExternally
}