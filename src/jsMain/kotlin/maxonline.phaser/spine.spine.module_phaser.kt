@file:JsQualifier("spine")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package spine

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

external open class Animation(name: String, timelines: Array<Timeline>, duration: Number) {
    open var name: String
    open var timelines: Array<Timeline>
    open var timelineIds: Array<Boolean>
    open var duration: Number
    open fun hasTimeline(id: Number): Boolean
    open fun apply(skeleton: Skeleton, lastTime: Number, time: Number, loop: Boolean, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        fun binarySearch(values: ArrayLike<Number>, target: Number, step: Number = definedExternally): Number
        fun linearSearch(values: ArrayLike<Number>, target: Number, step: Number): Number
    }
}

external interface Timeline {
    fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
    fun getPropertyId(): Number
}

external enum class MixBlend {
    setup /* = 0 */,
    first /* = 1 */,
    replace /* = 2 */,
    add /* = 3 */
}

external enum class MixDirection {
    mixIn /* = 0 */,
    mixOut /* = 1 */
}

external enum class TimelineType {
    rotate /* = 0 */,
    translate /* = 1 */,
    scale /* = 2 */,
    shear /* = 3 */,
    attachment /* = 4 */,
    color /* = 5 */,
    deform /* = 6 */,
    event /* = 7 */,
    drawOrder /* = 8 */,
    ikConstraint /* = 9 */,
    transformConstraint /* = 10 */,
    pathConstraintPosition /* = 11 */,
    pathConstraintSpacing /* = 12 */,
    pathConstraintMix /* = 13 */,
    twoColor /* = 14 */
}

external open class CurveTimeline(frameCount: Number) : Timeline {
    open var curves: Any
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setLinear(frameIndex: Number)
    open fun setStepped(frameIndex: Number)
    open fun getCurveType(frameIndex: Number): Number
    open fun setCurve(frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)
    open fun getCurvePercent(frameIndex: Number, percent: Number): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var LINEAR: Number
        var STEPPED: Number
        var BEZIER: Number
        var BEZIER_SIZE: Number
    }
}

external open class RotateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, degrees: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATION: Number
        var ROTATION: Number
    }
}

external open class TranslateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, x: Number, y: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_X: Number
        var PREV_Y: Number
        var X: Number
        var Y: Number
    }
}

external open class ScaleTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ShearTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
    }
}

external open class TwoColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number, r2: Number, g2: Number, b2: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var PREV_R2: Number
        var PREV_G2: Number
        var PREV_B2: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
        var R2: Number
        var G2: Number
        var B2: Number
    }
}

external open class AttachmentTimeline(frameCount: Number) : Timeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    open var attachmentNames: Array<String>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, attachmentName: String)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DeformTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var attachment: VertexAttachment
    open var frames: ArrayLike<Number>
    open var frameVertices: Array<ArrayLike<Number>>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, vertices: ArrayLike<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class EventTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var events: Array<Event>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, event: Event)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DrawOrderTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var drawOrders: Array<Array<Number>>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, drawOrder: Array<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class IkConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var ikConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, mix: Number, softness: Number, bendDirection: Number, compress: Boolean, stretch: Boolean)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_MIX: Number
        var PREV_SOFTNESS: Number
        var PREV_BEND_DIRECTION: Number
        var PREV_COMPRESS: Number
        var PREV_STRETCH: Number
        var MIX: Number
        var SOFTNESS: Number
        var BEND_DIRECTION: Number
        var COMPRESS: Number
        var STRETCH: Number
    }
}

external open class TransformConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var transformConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number, scaleMix: Number, shearMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var PREV_SCALE: Number
        var PREV_SHEAR: Number
        var ROTATE: Number
        var TRANSLATE: Number
        var SCALE: Number
        var SHEAR: Number
    }
}

external open class PathConstraintPositionTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, value: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_VALUE: Number
        var VALUE: Number
    }
}

external open class PathConstraintSpacingTimeline(frameCount: Number) : PathConstraintPositionTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class PathConstraintMixTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var ROTATE: Number
        var TRANSLATE: Number
    }
}

external open class AnimationState(data: AnimationStateData) {
    open var data: AnimationStateData
    open var tracks: Array<TrackEntry>
    open var events: Array<Event>
    open var listeners: Array<AnimationStateListener2>
    open var queue: EventQueue
    open var propertyIDs: IntSet
    open var animationsChanged: Boolean
    open var timeScale: Number
    open var trackEntryPool: Pool<TrackEntry>
    open fun update(delta: Number)
    open fun updateMixingFrom(to: TrackEntry, delta: Number): Boolean
    open fun apply(skeleton: Skeleton): Boolean
    open fun applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Number
    open fun applyRotateTimeline(timeline: Timeline, skeleton: Skeleton, time: Number, alpha: Number, blend: MixBlend, timelinesRotation: Array<Number>, i: Number, firstFrame: Boolean)
    open fun queueEvents(entry: TrackEntry, animationTime: Number)
    open fun clearTracks()
    open fun clearTrack(trackIndex: Number)
    open fun setCurrent(index: Number, current: TrackEntry, interrupt: Boolean)
    open fun setAnimation(trackIndex: Number, animationName: String, loop: Boolean): TrackEntry
    open fun setAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean): TrackEntry
    open fun addAnimation(trackIndex: Number, animationName: String, loop: Boolean, delay: Number): TrackEntry
    open fun addAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean, delay: Number): TrackEntry
    open fun setEmptyAnimation(trackIndex: Number, mixDuration: Number): TrackEntry
    open fun addEmptyAnimation(trackIndex: Number, mixDuration: Number, delay: Number): TrackEntry
    open fun setEmptyAnimations(mixDuration: Number)
    open fun expandToIndex(index: Number): TrackEntry
    open fun trackEntry(trackIndex: Number, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
    open fun disposeNext(entry: TrackEntry)
    open fun _animationsChanged()
    open fun computeHold(entry: TrackEntry)
    open fun computeNotLast(entry: TrackEntry)
    open fun getCurrent(trackIndex: Number): TrackEntry
    open fun addListener(listener: AnimationStateListener2)
    open fun removeListener(listener: AnimationStateListener2)
    open fun clearListeners()
    open fun clearListenerNotifications()

    companion object {
        var emptyAnimation: Animation
        var SUBSEQUENT: Number
        var FIRST: Number
        var HOLD: Number
        var HOLD_MIX: Number
        var NOT_LAST: Number
    }
}

external open class TrackEntry {
    open var animation: Animation
    open var next: TrackEntry
    open var mixingFrom: TrackEntry
    open var mixingTo: TrackEntry
    open var listener: AnimationStateListener2
    open var trackIndex: Number
    open var loop: Boolean
    open var holdPrevious: Boolean
    open var eventThreshold: Number
    open var attachmentThreshold: Number
    open var drawOrderThreshold: Number
    open var animationStart: Number
    open var animationEnd: Number
    open var animationLast: Number
    open var nextAnimationLast: Number
    open var delay: Number
    open var trackTime: Number
    open var trackLast: Number
    open var nextTrackLast: Number
    open var trackEnd: Number
    open var timeScale: Number
    open var alpha: Number
    open var mixTime: Number
    open var mixDuration: Number
    open var interruptAlpha: Number
    open var totalAlpha: Number
    open var mixBlend: MixBlend
    open var timelineMode: Array<Number>
    open var timelineHoldMix: Array<TrackEntry>
    open var timelinesRotation: Array<Number>
    open fun reset()
    open fun getAnimationTime(): Number
    open fun setAnimationLast(animationLast: Number)
    open fun isComplete(): Boolean
    open fun resetRotationDirections()
}

external open class EventQueue(animState: AnimationState) {
    open var objects: Array<Any>
    open var drainDisabled: Boolean
    open var animState: AnimationState
    open fun start(entry: TrackEntry)
    open fun interrupt(entry: TrackEntry)
    open fun end(entry: TrackEntry)
    open fun dispose(entry: TrackEntry)
    open fun complete(entry: TrackEntry)
    open fun event(entry: TrackEntry, event: Event)
    open fun drain()
    open fun clear()
}

external enum class EventType {
    start /* = 0 */,
    interrupt /* = 1 */,
    end /* = 2 */,
    dispose /* = 3 */,
    complete /* = 4 */,
    event /* = 5 */
}

external interface AnimationStateListener2 {
    fun start(entry: TrackEntry)
    fun interrupt(entry: TrackEntry)
    fun end(entry: TrackEntry)
    fun dispose(entry: TrackEntry)
    fun complete(entry: TrackEntry)
    fun event(entry: TrackEntry, event: Event)
}

external open class AnimationStateAdapter2 : AnimationStateListener2 {
    override fun start(entry: TrackEntry)
    override fun interrupt(entry: TrackEntry)
    override fun end(entry: TrackEntry)
    override fun dispose(entry: TrackEntry)
    override fun complete(entry: TrackEntry)
    override fun event(entry: TrackEntry, event: Event)
}

external open class AnimationStateData(skeletonData: SkeletonData) {
    open var skeletonData: SkeletonData
    open var animationToMixTime: Map<Number>
    open var defaultMix: Number
    open fun setMix(fromName: String, toName: String, duration: Number)
    open fun setMixWith(from: Animation, to: Animation, duration: Number)
    open fun getMix(from: Animation, to: Animation): Number
}

external open class AssetManager(textureLoader: (image: HTMLImageElement) -> Any, pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var textureLoader: Any
    open var assets: Any
    open var errors: Any
    open var toLoad: Any
    open var loaded: Any
    open fun loadBinary(path: String, success: (path: String, binary: Uint8Array) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadText(path: String, success: (path: String, text: String) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTexture(path: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureData(path: String, data: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureAtlas(path: String, success: (path: String, atlas: TextureAtlas) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun get(path: String): Any
    open fun remove(path: String)
    open fun removeAll()
    open fun isLoadingComplete(): Boolean
    open fun getToLoad(): Number
    open fun getLoaded(): Number
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>

    companion object {
        var downloadText: Any
        var downloadBinary: Any
    }
}

external open class AtlasAttachmentLoader(atlas: TextureAtlas) : AttachmentLoader {
    open var atlas: TextureAtlas
    override fun newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
    override fun newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
    override fun newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
    override fun newPathAttachment(skin: Skin, name: String): PathAttachment
    override fun newPointAttachment(skin: Skin, name: String): PointAttachment
    override fun newClippingAttachment(skin: Skin, name: String): ClippingAttachment
}

external enum class BlendMode {
    Normal /* = 0 */,
    Additive /* = 1 */,
    Multiply /* = 2 */,
    Screen /* = 3 */
}

external open class Bone(data: BoneData, skeleton: Skeleton, parent: Bone) : Updatable {
    open var data: BoneData
    open var skeleton: Skeleton
    open var parent: Bone
    open var children: Array<Bone>
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var ax: Number
    open var ay: Number
    open var arotation: Number
    open var ascaleX: Number
    open var ascaleY: Number
    open var ashearX: Number
    open var ashearY: Number
    open var appliedValid: Boolean
    open var a: Number
    open var b: Number
    open var worldX: Number
    open var c: Number
    open var d: Number
    open var worldY: Number
    open var sorted: Boolean
    open var active: Boolean
    override fun isActive(): Boolean
    override fun update()
    open fun updateWorldTransform()
    open fun updateWorldTransformWith(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number, shearX: Number, shearY: Number)
    open fun setToSetupPose()
    open fun getWorldRotationX(): Number
    open fun getWorldRotationY(): Number
    open fun getWorldScaleX(): Number
    open fun getWorldScaleY(): Number
    open fun updateAppliedTransform()
    open fun worldToLocal(world: Vector2): Vector2
    open fun localToWorld(local: Vector2): Vector2
    open fun worldToLocalRotation(worldRotation: Number): Number
    open fun localToWorldRotation(localRotation: Number): Number
    open fun rotateWorld(degrees: Number)
}

external open class BoneData(index: Number, name: String, parent: BoneData) {
    open var index: Number
    open var name: String
    open var parent: BoneData
    open var length: Number
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var transformMode: TransformMode
    open var skinRequired: Boolean
    open var color: Color
}

external enum class TransformMode {
    Normal /* = 0 */,
    OnlyTranslation /* = 1 */,
    NoRotationOrReflection /* = 2 */,
    NoScale /* = 3 */,
    NoScaleOrReflection /* = 4 */
}

external open class ConstraintData(name: String, order: Number, skinRequired: Boolean) {
    open var name: String
    open var order: Number
    open var skinRequired: Boolean
}

external open class Event(time: Number, data: EventData) {
    open var data: EventData
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var time: Number
    open var volume: Number
    open var balance: Number
}

external open class EventData(name: String) {
    open var name: String
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var audioPath: String
    open var volume: Number
    open var balance: Number
}

external open class IkConstraint(data: IkConstraintData, skeleton: Skeleton) : Updatable {
    open var data: IkConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var mix: Number
    open var softness: Number
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun apply1(bone: Bone, targetX: Number, targetY: Number, compress: Boolean, stretch: Boolean, uniform: Boolean, alpha: Number)
    open fun apply2(parent: Bone, child: Bone, targetX: Number, targetY: Number, bendDir: Number, stretch: Boolean, softness: Number, alpha: Number)
}

external open class IkConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var uniform: Boolean
    open var mix: Number
    open var softness: Number
}

external open class PathConstraint(data: PathConstraintData, skeleton: Skeleton) : Updatable {
    open var data: PathConstraintData
    open var bones: Array<Bone>
    open var target: Slot
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
    open var spaces: Array<Number>
    open var positions: Array<Number>
    open var world: Array<Number>
    open var curves: Array<Number>
    open var lengths: Array<Number>
    open var segments: Array<Number>
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun computeWorldPositions(path: PathAttachment, spacesCount: Number, tangents: Boolean, percentPosition: Boolean, percentSpacing: Boolean): Array<Number>
    open fun addBeforePosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addAfterPosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addCurvePosition(p: Number, x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, out: Array<Number>, o: Number, tangents: Boolean)

    companion object {
        var NONE: Number
        var BEFORE: Number
        var AFTER: Number
        var epsilon: Number
    }
}

external open class PathConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: SlotData
    open var positionMode: PositionMode
    open var spacingMode: SpacingMode
    open var rotateMode: RotateMode
    open var offsetRotation: Number
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
}

external enum class PositionMode {
    Fixed /* = 0 */,
    Percent /* = 1 */
}

external enum class SpacingMode {
    Length /* = 0 */,
    Fixed /* = 1 */,
    Percent /* = 2 */
}

external enum class RotateMode {
    Tangent /* = 0 */,
    Chain /* = 1 */,
    ChainScale /* = 2 */
}

external open class SharedAssetManager(pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var clientAssets: Any
    open var queuedAssets: Any
    open var rawAssets: Any
    open var errors: Any
    open var queueAsset: Any
    open fun loadText(clientId: String, path: String)
    open fun loadJson(clientId: String, path: String)
    open fun loadTexture(clientId: String, textureLoader: (image: HTMLImageElement) -> Any, path: String)
    open fun get(clientId: String, path: String): Any
    open var updateClientAssets: Any
    open fun isLoadingComplete(clientId: String): Boolean
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>
}

external open class Skeleton(data: SkeletonData) {
    open var data: SkeletonData
    open var bones: Array<Bone>
    open var slots: Array<Slot>
    open var drawOrder: Array<Slot>
    open var ikConstraints: Array<IkConstraint>
    open var transformConstraints: Array<TransformConstraint>
    open var pathConstraints: Array<PathConstraint>
    open var _updateCache: Array<Updatable>
    open var updateCacheReset: Array<Updatable>
    open var skin: Skin
    open var color: Color
    open var time: Number
    open var scaleX: Number
    open var scaleY: Number
    open var x: Number
    open var y: Number
    open fun updateCache()
    open fun sortIkConstraint(constraint: IkConstraint)
    open fun sortPathConstraint(constraint: PathConstraint)
    open fun sortTransformConstraint(constraint: TransformConstraint)
    open fun sortPathConstraintAttachment(skin: Skin, slotIndex: Number, slotBone: Bone)
    open fun sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone)
    open fun sortBone(bone: Bone)
    open fun sortReset(bones: Array<Bone>)
    open fun updateWorldTransform()
    open fun setToSetupPose()
    open fun setBonesToSetupPose()
    open fun setSlotsToSetupPose()
    open fun getRootBone(): Bone
    open fun findBone(boneName: String): Bone
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): Slot
    open fun findSlotIndex(slotName: String): Number
    open fun setSkinByName(skinName: String)
    open fun setSkin(newSkin: Skin)
    open fun getAttachmentByName(slotName: String, attachmentName: String): Attachment
    open fun getAttachment(slotIndex: Number, attachmentName: String): Attachment
    open fun setAttachment(slotName: String, attachmentName: String)
    open fun findIkConstraint(constraintName: String): IkConstraint
    open fun findTransformConstraint(constraintName: String): TransformConstraint
    open fun findPathConstraint(constraintName: String): PathConstraint
    open fun getBounds(offset: Vector2, size: Vector2, temp: Array<Number> = definedExternally)
    open fun update(delta: Number)
}

external open class SkeletonBinary(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(binary: Uint8Array): SkeletonData
    open var readSkin: Any
    open var readAttachment: Any
    open var readVertices: Any
    open var readFloatArray: Any
    open var readShortArray: Any
    open var readAnimation: Any
    open var readCurve: Any
    open fun setCurve(timeline: CurveTimeline, frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)

    companion object {
        var AttachmentTypeValues: Array<Number>
        var TransformModeValues: Array<TransformMode>
        var PositionModeValues: Array<PositionMode>
        var SpacingModeValues: Array<SpacingMode>
        var RotateModeValues: Array<RotateMode>
        var BlendModeValues: Array<BlendMode>
        var BONE_ROTATE: Number
        var BONE_TRANSLATE: Number
        var BONE_SCALE: Number
        var BONE_SHEAR: Number
        var SLOT_ATTACHMENT: Number
        var SLOT_COLOR: Number
        var SLOT_TWO_COLOR: Number
        var PATH_POSITION: Number
        var PATH_SPACING: Number
        var PATH_MIX: Number
        var CURVE_LINEAR: Number
        var CURVE_STEPPED: Number
        var CURVE_BEZIER: Number
    }
}

external open class SkeletonBounds {
    open var minX: Number
    open var minY: Number
    open var maxX: Number
    open var maxY: Number
    open var boundingBoxes: Array<BoundingBoxAttachment>
    open var polygons: Array<ArrayLike<Number>>
    open var polygonPool: Any
    open fun update(skeleton: Skeleton, updateAabb: Boolean)
    open fun aabbCompute()
    open fun aabbContainsPoint(x: Number, y: Number): Boolean
    open fun aabbIntersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean
    open fun containsPoint(x: Number, y: Number): BoundingBoxAttachment
    open fun containsPointPolygon(polygon: ArrayLike<Number>, x: Number, y: Number): Boolean
    open fun intersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): BoundingBoxAttachment
    open fun intersectsSegmentPolygon(polygon: ArrayLike<Number>, x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike<Number>
    open fun getWidth(): Number
    open fun getHeight(): Number
}

external open class SkeletonClipping {
    open var triangulator: Any
    open var clippingPolygon: Any
    open var clipOutput: Any
    open var clippedVertices: Array<Number>
    open var clippedTriangles: Array<Number>
    open var scratch: Any
    open var clipAttachment: Any
    open var clippingPolygons: Any
    open fun clipStart(slot: Slot, clip: ClippingAttachment): Number
    open fun clipEndWithSlot(slot: Slot)
    open fun clipEnd()
    open fun isClipping(): Boolean
    open fun clipTriangles(vertices: ArrayLike<Number>, verticesLength: Number, triangles: ArrayLike<Number>, trianglesLength: Number, uvs: ArrayLike<Number>, light: Color, dark: Color, twoColor: Boolean)
    open fun clip(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, clippingArea: Array<Number>, output: Array<Number>): Boolean

    companion object {
        fun makeClockwise(polygon: ArrayLike<Number>)
    }
}

external open class SkeletonData {
    open var name: String
    open var bones: Array<BoneData>
    open var slots: Array<SlotData>
    open var skins: Array<Skin>
    open var defaultSkin: Skin
    open var events: Array<EventData>
    open var animations: Array<Animation>
    open var ikConstraints: Array<IkConstraintData>
    open var transformConstraints: Array<TransformConstraintData>
    open var pathConstraints: Array<PathConstraintData>
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var version: String
    open var hash: String
    open var fps: Number
    open var imagesPath: String
    open var audioPath: String
    open fun findBone(boneName: String): BoneData
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): SlotData
    open fun findSlotIndex(slotName: String): Number
    open fun findSkin(skinName: String): Skin
    open fun findEvent(eventDataName: String): EventData
    open fun findAnimation(animationName: String): Animation
    open fun findIkConstraint(constraintName: String): IkConstraintData
    open fun findTransformConstraint(constraintName: String): TransformConstraintData
    open fun findPathConstraint(constraintName: String): PathConstraintData
    open fun findPathConstraintIndex(pathConstraintName: String): Number
}

external open class SkeletonJson(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(json: String): SkeletonData
    open fun readSkeletonData(json: Any): SkeletonData
    open fun readAttachment(map: Any, skin: Skin, slotIndex: Number, name: String, skeletonData: SkeletonData): Attachment
    open fun readVertices(map: Any, attachment: VertexAttachment, verticesLength: Number)
    open fun readAnimation(map: Any, name: String, skeletonData: SkeletonData)
    open fun readCurve(map: Any, timeline: CurveTimeline, frameIndex: Number)
    open fun getValue(map: Any, prop: String, defaultValue: Any): Any

    companion object {
        fun blendModeFromString(str: String): BlendMode
        fun positionModeFromString(str: String): PositionMode
        fun spacingModeFromString(str: String): SpacingMode
        fun rotateModeFromString(str: String): RotateMode
        fun transformModeFromString(str: String): TransformMode
    }
}

external open class SkinEntry(slotIndex: Number, name: String, attachment: Attachment) {
    open var slotIndex: Number
    open var name: String
    open var attachment: Attachment
}

external open class Skin(name: String) {
    open var name: String
    open var attachments: Array<Map<Attachment>>
    open var bones: Array<BoneData>
    open var constraints: Array<ConstraintData>
    open fun setAttachment(slotIndex: Number, name: String, attachment: Attachment)
    open fun addSkin(skin: Skin)
    open fun copySkin(skin: Skin)
    open fun getAttachment(slotIndex: Number, name: String): Attachment
    open fun removeAttachment(slotIndex: Number, name: String)
    open fun getAttachments(): Array<SkinEntry>
    open fun getAttachmentsForSlot(slotIndex: Number, attachments: Array<SkinEntry>)
    open fun clear()
    open fun attachAll(skeleton: Skeleton, oldSkin: Skin)
}

external open class Slot(data: SlotData, bone: Bone) {
    open var data: SlotData
    open var bone: Bone
    open var color: Color
    open var darkColor: Color
    open var attachment: Any
    open var attachmentTime: Any
    open var deform: Array<Number>
    open fun getAttachment(): Attachment
    open fun setAttachment(attachment: Attachment)
    open fun setAttachmentTime(time: Number)
    open fun getAttachmentTime(): Number
    open fun setToSetupPose()
}

external open class SlotData(index: Number, name: String, boneData: BoneData) {
    open var index: Number
    open var name: String
    open var boneData: BoneData
    open var color: Color
    open var darkColor: Color
    open var attachmentName: String
    open var blendMode: BlendMode
}

external open class Texture(image: HTMLImageElement) {
    open var _image: HTMLImageElement
    open fun getImage(): HTMLImageElement
    open fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    open fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    open fun dispose()

    companion object {
        fun filterFromString(text: String): TextureFilter
        fun wrapFromString(text: String): TextureWrap
    }
}

external enum class TextureFilter {
    Nearest /* = 9728 */,
    Linear /* = 9729 */,
    MipMap /* = 9987 */,
    MipMapNearestNearest /* = 9984 */,
    MipMapLinearNearest /* = 9985 */,
    MipMapNearestLinear /* = 9986 */,
    MipMapLinearLinear /* = 9987 */
}

external enum class TextureWrap {
    MirroredRepeat /* = 33648 */,
    ClampToEdge /* = 33071 */,
    Repeat /* = 10497 */
}

external open class TextureRegion {
    open var renderObject: Any
    open var u: Number
    open var v: Number
    open var u2: Number
    open var v2: Number
    open var width: Number
    open var height: Number
    open var rotate: Boolean
    open var offsetX: Number
    open var offsetY: Number
    open var originalWidth: Number
    open var originalHeight: Number
}

external open class FakeTexture(image: HTMLImageElement) : Texture {
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    override fun dispose()
}

external open class TextureAtlas(atlasText: String, textureLoader: (path: String) -> Any) : Disposable {
    open var pages: Array<TextureAtlasPage>
    open var regions: Array<TextureAtlasRegion>
    open var load: Any
    open fun findRegion(name: String): TextureAtlasRegion
    override fun dispose()
}

external open class TextureAtlasPage {
    open var name: String
    open var minFilter: TextureFilter
    open var magFilter: TextureFilter
    open var uWrap: TextureWrap
    open var vWrap: TextureWrap
    open var texture: Texture
    open var width: Number
    open var height: Number
}

external open class TextureAtlasRegion : TextureRegion {
    open var page: TextureAtlasPage
    open var name: String
    open var x: Number
    open var y: Number
    open var index: Number
    override var rotate: Boolean
    open var degrees: Number
    open var texture: Texture
}

external open class TransformConstraint(data: TransformConstraintData, skeleton: Skeleton) : Updatable {
    open var data: TransformConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var temp: Vector2
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun applyAbsoluteWorld()
    open fun applyRelativeWorld()
    open fun applyAbsoluteLocal()
    open fun applyRelativeLocal()
}

external open class TransformConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var offsetRotation: Number
    open var offsetX: Number
    open var offsetY: Number
    open var offsetScaleX: Number
    open var offsetScaleY: Number
    open var offsetShearY: Number
    open var relative: Boolean
    open var local: Boolean
}

external open class Triangulator {
    open var convexPolygons: Any
    open var convexPolygonsIndices: Any
    open var indicesArray: Any
    open var isConcaveArray: Any
    open var triangles: Any
    open var polygonPool: Any
    open var polygonIndicesPool: Any
    open fun triangulate(verticesArray: ArrayLike<Number>): Array<Number>
    open fun decompose(verticesArray: Array<Number>, triangles: Array<Number>): Array<Array<Number>>

    companion object {
        var isConcave: Any
        var positiveArea: Any
        var winding: Any
    }
}

external interface Updatable {
    fun update()
    fun isActive(): Boolean
}

external interface Map<T> {
    @nativeGetter
    operator fun get(key: String): dynamic
    @nativeSetter
    operator fun set(key: String, value: T)
}

external open class IntSet {
    open var array: Array<Number>
    open fun add(value: Number): Boolean
    open fun contains(value: Number): Boolean
    open fun remove(value: Number)
    open fun clear()
}

external interface Disposable {
    fun dispose()
}

external interface Restorable {
    fun restore()
}

external open class Color(r: Number = definedExternally, g: Number = definedExternally, b: Number = definedExternally, a: Number = definedExternally) {
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open fun set(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun setFromColor(c: Color): Color /* this */
    open fun setFromString(hex: String): Color /* this */
    open fun add(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun clamp(): Color /* this */

    companion object {
        var WHITE: Color
        var RED: Color
        var GREEN: Color
        var BLUE: Color
        var MAGENTA: Color
        fun rgba8888ToColor(color: Color, value: Number)
        fun rgb888ToColor(color: Color, value: Number)
    }
}

external open class MathUtils {
    companion object {
        var PI: Number
        var PI2: Number
        var radiansToDegrees: Number
        var radDeg: Number
        var degreesToRadians: Number
        var degRad: Number
        fun clamp(value: Number, min: Number, max: Number): Number
        fun cosDeg(degrees: Number): Number
        fun sinDeg(degrees: Number): Number
        fun signum(value: Number): Number
        fun toInt(x: Number): Number
        fun cbrt(x: Number): Number
        fun randomTriangular(min: Number, max: Number): Number
        fun randomTriangularWith(min: Number, max: Number, mode: Number): Number
    }
}

external open class Interpolation {
    open fun applyInternal(a: Number): Number
    open fun apply(start: Number, end: Number, a: Number): Number
}

external open class Pow(power: Number) : Interpolation {
    open var power: Number
    override fun applyInternal(a: Number): Number
}

external open class PowOut(power: Number) : Pow {
    override fun applyInternal(a: Number): Number
}

external open class Utils {
    companion object {
        var SUPPORTS_TYPED_ARRAYS: Boolean
        fun <T> arrayCopy(source: ArrayLike<T>, sourceStart: Number, dest: ArrayLike<T>, destStart: Number, numElements: Number)
        fun <T> setArraySize(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> ensureArrayCapacity(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> newArray(size: Number, defaultValue: T): Array<T>
        fun newFloatArray(size: Number): ArrayLike<Number>
        fun newShortArray(size: Number): ArrayLike<Number>
        fun toFloatArray(array: Array<Number>): dynamic /* Array<Number> | Float32Array */
        fun toSinglePrecision(value: Number): Number
        fun webkit602BugfixHelper(alpha: Number, blend: MixBlend)
        fun <T> contains(array: Array<T>, element: T, identity: Boolean = definedExternally): Boolean
    }
}

external open class DebugUtils {
    companion object {
        fun logBones(skeleton: Skeleton)
    }
}

external open class Pool<T>(instantiator: () -> T) {
    open var items: Any
    open var instantiator: Any
    open fun obtain(): T
    open fun free(item: T)
    open fun freeAll(items: ArrayLike<T>)
    open fun clear()
}

external open class Vector2(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open fun set(x: Number, y: Number): Vector2
    open fun length(): Number
    open fun normalize(): Vector2 /* this */
}

external open class TimeKeeper {
    open var maxDelta: Number
    open var framesPerSecond: Number
    open var delta: Number
    open var totalTime: Number
    open var lastTime: Any
    open var frameCount: Any
    open var frameTime: Any
    open fun update()
}

external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): dynamic
    @nativeSetter
    operator fun set(n: Number, value: T)
}

external open class WindowedMean(windowSize: Number = definedExternally) {
    open var values: Array<Number>
    open var addedValues: Number
    open var lastValue: Number
    open var mean: Number
    open var dirty: Boolean
    open fun hasEnoughData(): Boolean
    open fun addValue(value: Number)
    open fun getMean(): Number
}

external interface VertexEffect {
    fun begin(skeleton: Skeleton)
    fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    fun end()
}

external open class Attachment(name: String) {
    open var name: String
    open fun copy(): Attachment
}

external open class VertexAttachment(name: String) : Attachment {
    open var id: Number
    open var bones: Array<Number>
    open var vertices: ArrayLike<Number>
    open var worldVerticesLength: Number
    open var deformAttachment: VertexAttachment
    open fun computeWorldVertices(slot: Slot, start: Number, count: Number, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    open fun copyTo(attachment: VertexAttachment)

    companion object {
        var nextID: Any
    }
}

external interface AttachmentLoader {
    fun newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
    fun newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
    fun newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
    fun newPathAttachment(skin: Skin, name: String): PathAttachment
    fun newPointAttachment(skin: Skin, name: String): PointAttachment
    fun newClippingAttachment(skin: Skin, name: String): ClippingAttachment
}

external enum class AttachmentType {
    Region /* = 0 */,
    BoundingBox /* = 1 */,
    Mesh /* = 2 */,
    LinkedMesh /* = 3 */,
    Path /* = 4 */,
    Point /* = 5 */,
    Clipping /* = 6 */
}

external open class BoundingBoxAttachment(name: String) : VertexAttachment {
    open var color: Color
    override fun copy(): Attachment
}

external open class ClippingAttachment(name: String) : VertexAttachment {
    open var endSlot: SlotData
    open var color: Color
    override fun copy(): Attachment
}

external open class MeshAttachment(name: String) : VertexAttachment {
    open var region: TextureRegion
    open var path: String
    open var regionUVs: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var triangles: Array<Number>
    open var color: Color
    open var width: Number
    open var height: Number
    open var hullLength: Number
    open var edges: Array<Number>
    open var parentMesh: Any
    open var tempColor: Color
    open fun updateUVs()
    open fun getParentMesh(): MeshAttachment
    open fun setParentMesh(parentMesh: MeshAttachment)
    override fun copy(): Attachment
    open fun newLinkedMesh(): MeshAttachment
}

external open class PathAttachment(name: String) : VertexAttachment {
    open var lengths: Array<Number>
    open var closed: Boolean
    open var constantSpeed: Boolean
    open var color: Color
    override fun copy(): Attachment
}

external open class PointAttachment(name: String) : VertexAttachment {
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var color: Color
    open fun computeWorldPosition(bone: Bone, point: Vector2): Vector2
    open fun computeWorldRotation(bone: Bone): Number
    override fun copy(): Attachment
}

external open class RegionAttachment(name: String) : Attachment {
    open var x: Number
    open var y: Number
    open var scaleX: Number
    open var scaleY: Number
    open var rotation: Number
    open var width: Number
    open var height: Number
    open var color: Color
    open var path: String
    open var rendererObject: Any
    open var region: TextureRegion
    open var offset: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var tempColor: Color
    open fun updateOffset()
    open fun setRegion(region: TextureRegion)
    open fun computeWorldVertices(bone: Bone, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    override fun copy(): Attachment

    companion object {
        var OX1: Number
        var OY1: Number
        var OX2: Number
        var OY2: Number
        var OX3: Number
        var OY3: Number
        var OX4: Number
        var OY4: Number
        var X1: Number
        var Y1: Number
        var C1R: Number
        var C1G: Number
        var C1B: Number
        var C1A: Number
        var U1: Number
        var V1: Number
        var X2: Number
        var Y2: Number
        var C2R: Number
        var C2G: Number
        var C2B: Number
        var C2A: Number
        var U2: Number
        var V2: Number
        var X3: Number
        var Y3: Number
        var C3R: Number
        var C3G: Number
        var C3B: Number
        var C3A: Number
        var U3: Number
        var V3: Number
        var X4: Number
        var Y4: Number
        var C4R: Number
        var C4G: Number
        var C4B: Number
        var C4A: Number
        var U4: Number
        var V4: Number
    }
}

external open class JitterEffect(jitterX: Number, jitterY: Number) : VertexEffect {
    open var jitterX: Number
    open var jitterY: Number
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()
}

external open class SwirlEffect(radius: Number) : VertexEffect {
    open var centerX: Number
    open var centerY: Number
    open var radius: Number
    open var angle: Number
    open var worldX: Any
    open var worldY: Any
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()

    companion object {
        var interpolation: PowOut
    }
}

external open class Animation(name: String, timelines: Array<Timeline>, duration: Number) {
    open var name: String
    open var timelines: Array<Timeline>
    open var timelineIds: Array<Boolean>
    open var duration: Number
    open fun hasTimeline(id: Number): Boolean
    open fun apply(skeleton: Skeleton, lastTime: Number, time: Number, loop: Boolean, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        fun binarySearch(values: ArrayLike<Number>, target: Number, step: Number = definedExternally): Number
        fun linearSearch(values: ArrayLike<Number>, target: Number, step: Number): Number
    }
}

external enum class MixBlend {
    setup /* = 0 */,
    first /* = 1 */,
    replace /* = 2 */,
    add /* = 3 */
}

external enum class MixDirection {
    mixIn /* = 0 */,
    mixOut /* = 1 */
}

external enum class TimelineType {
    rotate /* = 0 */,
    translate /* = 1 */,
    scale /* = 2 */,
    shear /* = 3 */,
    attachment /* = 4 */,
    color /* = 5 */,
    deform /* = 6 */,
    event /* = 7 */,
    drawOrder /* = 8 */,
    ikConstraint /* = 9 */,
    transformConstraint /* = 10 */,
    pathConstraintPosition /* = 11 */,
    pathConstraintSpacing /* = 12 */,
    pathConstraintMix /* = 13 */,
    twoColor /* = 14 */
}

external open class CurveTimeline(frameCount: Number) : Timeline {
    open var curves: Any
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setLinear(frameIndex: Number)
    open fun setStepped(frameIndex: Number)
    open fun getCurveType(frameIndex: Number): Number
    open fun setCurve(frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)
    open fun getCurvePercent(frameIndex: Number, percent: Number): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var LINEAR: Number
        var STEPPED: Number
        var BEZIER: Number
        var BEZIER_SIZE: Number
    }
}

external open class RotateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, degrees: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATION: Number
        var ROTATION: Number
    }
}

external open class TranslateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, x: Number, y: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_X: Number
        var PREV_Y: Number
        var X: Number
        var Y: Number
    }
}

external open class ScaleTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ShearTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
    }
}

external open class TwoColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number, r2: Number, g2: Number, b2: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var PREV_R2: Number
        var PREV_G2: Number
        var PREV_B2: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
        var R2: Number
        var G2: Number
        var B2: Number
    }
}

external open class AttachmentTimeline(frameCount: Number) : Timeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    open var attachmentNames: Array<String>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, attachmentName: String)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DeformTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var attachment: VertexAttachment
    open var frames: ArrayLike<Number>
    open var frameVertices: Array<ArrayLike<Number>>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, vertices: ArrayLike<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class EventTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var events: Array<Event>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, event: Event)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DrawOrderTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var drawOrders: Array<Array<Number>>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, drawOrder: Array<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class IkConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var ikConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, mix: Number, softness: Number, bendDirection: Number, compress: Boolean, stretch: Boolean)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_MIX: Number
        var PREV_SOFTNESS: Number
        var PREV_BEND_DIRECTION: Number
        var PREV_COMPRESS: Number
        var PREV_STRETCH: Number
        var MIX: Number
        var SOFTNESS: Number
        var BEND_DIRECTION: Number
        var COMPRESS: Number
        var STRETCH: Number
    }
}

external open class TransformConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var transformConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number, scaleMix: Number, shearMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var PREV_SCALE: Number
        var PREV_SHEAR: Number
        var ROTATE: Number
        var TRANSLATE: Number
        var SCALE: Number
        var SHEAR: Number
    }
}

external open class PathConstraintPositionTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, value: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_VALUE: Number
        var VALUE: Number
    }
}

external open class PathConstraintSpacingTimeline(frameCount: Number) : PathConstraintPositionTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class PathConstraintMixTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var ROTATE: Number
        var TRANSLATE: Number
    }
}

external open class AnimationState(data: AnimationStateData) {
    open var data: AnimationStateData
    open var tracks: Array<TrackEntry>
    open var events: Array<Event>
    open var listeners: Array<AnimationStateListener2>
    open var queue: EventQueue
    open var propertyIDs: IntSet
    open var animationsChanged: Boolean
    open var timeScale: Number
    open var trackEntryPool: Pool<TrackEntry>
    open fun update(delta: Number)
    open fun updateMixingFrom(to: TrackEntry, delta: Number): Boolean
    open fun apply(skeleton: Skeleton): Boolean
    open fun applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Number
    open fun applyRotateTimeline(timeline: Timeline, skeleton: Skeleton, time: Number, alpha: Number, blend: MixBlend, timelinesRotation: Array<Number>, i: Number, firstFrame: Boolean)
    open fun queueEvents(entry: TrackEntry, animationTime: Number)
    open fun clearTracks()
    open fun clearTrack(trackIndex: Number)
    open fun setCurrent(index: Number, current: TrackEntry, interrupt: Boolean)
    open fun setAnimation(trackIndex: Number, animationName: String, loop: Boolean): TrackEntry
    open fun setAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean): TrackEntry
    open fun addAnimation(trackIndex: Number, animationName: String, loop: Boolean, delay: Number): TrackEntry
    open fun addAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean, delay: Number): TrackEntry
    open fun setEmptyAnimation(trackIndex: Number, mixDuration: Number): TrackEntry
    open fun addEmptyAnimation(trackIndex: Number, mixDuration: Number, delay: Number): TrackEntry
    open fun setEmptyAnimations(mixDuration: Number)
    open fun expandToIndex(index: Number): TrackEntry
    open fun trackEntry(trackIndex: Number, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
    open fun disposeNext(entry: TrackEntry)
    open fun _animationsChanged()
    open fun computeHold(entry: TrackEntry)
    open fun computeNotLast(entry: TrackEntry)
    open fun getCurrent(trackIndex: Number): TrackEntry
    open fun addListener(listener: AnimationStateListener2)
    open fun removeListener(listener: AnimationStateListener2)
    open fun clearListeners()
    open fun clearListenerNotifications()

    companion object {
        var emptyAnimation: Animation
        var SUBSEQUENT: Number
        var FIRST: Number
        var HOLD: Number
        var HOLD_MIX: Number
        var NOT_LAST: Number
    }
}

external open class TrackEntry {
    open var animation: Animation
    open var next: TrackEntry
    open var mixingFrom: TrackEntry
    open var mixingTo: TrackEntry
    open var listener: AnimationStateListener2
    open var trackIndex: Number
    open var loop: Boolean
    open var holdPrevious: Boolean
    open var eventThreshold: Number
    open var attachmentThreshold: Number
    open var drawOrderThreshold: Number
    open var animationStart: Number
    open var animationEnd: Number
    open var animationLast: Number
    open var nextAnimationLast: Number
    open var delay: Number
    open var trackTime: Number
    open var trackLast: Number
    open var nextTrackLast: Number
    open var trackEnd: Number
    open var timeScale: Number
    open var alpha: Number
    open var mixTime: Number
    open var mixDuration: Number
    open var interruptAlpha: Number
    open var totalAlpha: Number
    open var mixBlend: MixBlend
    open var timelineMode: Array<Number>
    open var timelineHoldMix: Array<TrackEntry>
    open var timelinesRotation: Array<Number>
    open fun reset()
    open fun getAnimationTime(): Number
    open fun setAnimationLast(animationLast: Number)
    open fun isComplete(): Boolean
    open fun resetRotationDirections()
}

external open class EventQueue(animState: AnimationState) {
    open var objects: Array<Any>
    open var drainDisabled: Boolean
    open var animState: AnimationState
    open fun start(entry: TrackEntry)
    open fun interrupt(entry: TrackEntry)
    open fun end(entry: TrackEntry)
    open fun dispose(entry: TrackEntry)
    open fun complete(entry: TrackEntry)
    open fun event(entry: TrackEntry, event: Event)
    open fun drain()
    open fun clear()
}

external enum class EventType {
    start /* = 0 */,
    interrupt /* = 1 */,
    end /* = 2 */,
    dispose /* = 3 */,
    complete /* = 4 */,
    event /* = 5 */
}

external open class AnimationStateAdapter2 : AnimationStateListener2 {
    override fun start(entry: TrackEntry)
    override fun interrupt(entry: TrackEntry)
    override fun end(entry: TrackEntry)
    override fun dispose(entry: TrackEntry)
    override fun complete(entry: TrackEntry)
    override fun event(entry: TrackEntry, event: Event)
}

external open class AnimationStateData(skeletonData: SkeletonData) {
    open var skeletonData: SkeletonData
    open var animationToMixTime: Map<Number>
    open var defaultMix: Number
    open fun setMix(fromName: String, toName: String, duration: Number)
    open fun setMixWith(from: Animation, to: Animation, duration: Number)
    open fun getMix(from: Animation, to: Animation): Number
}

external open class AssetManager(textureLoader: (image: HTMLImageElement) -> Any, pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var textureLoader: Any
    open var assets: Any
    open var errors: Any
    open var toLoad: Any
    open var loaded: Any
    open fun loadBinary(path: String, success: (path: String, binary: Uint8Array) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadText(path: String, success: (path: String, text: String) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTexture(path: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureData(path: String, data: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureAtlas(path: String, success: (path: String, atlas: TextureAtlas) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun get(path: String): Any
    open fun remove(path: String)
    open fun removeAll()
    open fun isLoadingComplete(): Boolean
    open fun getToLoad(): Number
    open fun getLoaded(): Number
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>

    companion object {
        var downloadText: Any
        var downloadBinary: Any
    }
}

external open class AtlasAttachmentLoader(atlas: TextureAtlas) : AttachmentLoader {
    open var atlas: TextureAtlas
    override fun newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
    override fun newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
    override fun newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
    override fun newPathAttachment(skin: Skin, name: String): PathAttachment
    override fun newPointAttachment(skin: Skin, name: String): PointAttachment
    override fun newClippingAttachment(skin: Skin, name: String): ClippingAttachment
}

external enum class BlendMode {
    Normal /* = 0 */,
    Additive /* = 1 */,
    Multiply /* = 2 */,
    Screen /* = 3 */
}

external open class Bone(data: BoneData, skeleton: Skeleton, parent: Bone) : Updatable {
    open var data: BoneData
    open var skeleton: Skeleton
    open var parent: Bone
    open var children: Array<Bone>
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var ax: Number
    open var ay: Number
    open var arotation: Number
    open var ascaleX: Number
    open var ascaleY: Number
    open var ashearX: Number
    open var ashearY: Number
    open var appliedValid: Boolean
    open var a: Number
    open var b: Number
    open var worldX: Number
    open var c: Number
    open var d: Number
    open var worldY: Number
    open var sorted: Boolean
    open var active: Boolean
    override fun isActive(): Boolean
    override fun update()
    open fun updateWorldTransform()
    open fun updateWorldTransformWith(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number, shearX: Number, shearY: Number)
    open fun setToSetupPose()
    open fun getWorldRotationX(): Number
    open fun getWorldRotationY(): Number
    open fun getWorldScaleX(): Number
    open fun getWorldScaleY(): Number
    open fun updateAppliedTransform()
    open fun worldToLocal(world: Vector2): Vector2
    open fun localToWorld(local: Vector2): Vector2
    open fun worldToLocalRotation(worldRotation: Number): Number
    open fun localToWorldRotation(localRotation: Number): Number
    open fun rotateWorld(degrees: Number)
}

external open class BoneData(index: Number, name: String, parent: BoneData) {
    open var index: Number
    open var name: String
    open var parent: BoneData
    open var length: Number
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var transformMode: TransformMode
    open var skinRequired: Boolean
    open var color: Color
}

external enum class TransformMode {
    Normal /* = 0 */,
    OnlyTranslation /* = 1 */,
    NoRotationOrReflection /* = 2 */,
    NoScale /* = 3 */,
    NoScaleOrReflection /* = 4 */
}

external open class ConstraintData(name: String, order: Number, skinRequired: Boolean) {
    open var name: String
    open var order: Number
    open var skinRequired: Boolean
}

external open class Event(time: Number, data: EventData) {
    open var data: EventData
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var time: Number
    open var volume: Number
    open var balance: Number
}

external open class EventData(name: String) {
    open var name: String
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var audioPath: String
    open var volume: Number
    open var balance: Number
}

external open class IkConstraint(data: IkConstraintData, skeleton: Skeleton) : Updatable {
    open var data: IkConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var mix: Number
    open var softness: Number
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun apply1(bone: Bone, targetX: Number, targetY: Number, compress: Boolean, stretch: Boolean, uniform: Boolean, alpha: Number)
    open fun apply2(parent: Bone, child: Bone, targetX: Number, targetY: Number, bendDir: Number, stretch: Boolean, softness: Number, alpha: Number)
}

external open class IkConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var uniform: Boolean
    open var mix: Number
    open var softness: Number
}

external open class PathConstraint(data: PathConstraintData, skeleton: Skeleton) : Updatable {
    open var data: PathConstraintData
    open var bones: Array<Bone>
    open var target: Slot
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
    open var spaces: Array<Number>
    open var positions: Array<Number>
    open var world: Array<Number>
    open var curves: Array<Number>
    open var lengths: Array<Number>
    open var segments: Array<Number>
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun computeWorldPositions(path: PathAttachment, spacesCount: Number, tangents: Boolean, percentPosition: Boolean, percentSpacing: Boolean): Array<Number>
    open fun addBeforePosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addAfterPosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addCurvePosition(p: Number, x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, out: Array<Number>, o: Number, tangents: Boolean)

    companion object {
        var NONE: Number
        var BEFORE: Number
        var AFTER: Number
        var epsilon: Number
    }
}

external open class PathConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: SlotData
    open var positionMode: PositionMode
    open var spacingMode: SpacingMode
    open var rotateMode: RotateMode
    open var offsetRotation: Number
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
}

external enum class PositionMode {
    Fixed /* = 0 */,
    Percent /* = 1 */
}

external enum class SpacingMode {
    Length /* = 0 */,
    Fixed /* = 1 */,
    Percent /* = 2 */
}

external enum class RotateMode {
    Tangent /* = 0 */,
    Chain /* = 1 */,
    ChainScale /* = 2 */
}

external open class SharedAssetManager(pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var clientAssets: Any
    open var queuedAssets: Any
    open var rawAssets: Any
    open var errors: Any
    open var queueAsset: Any
    open fun loadText(clientId: String, path: String)
    open fun loadJson(clientId: String, path: String)
    open fun loadTexture(clientId: String, textureLoader: (image: HTMLImageElement) -> Any, path: String)
    open fun get(clientId: String, path: String): Any
    open var updateClientAssets: Any
    open fun isLoadingComplete(clientId: String): Boolean
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>
}

external open class Skeleton(data: SkeletonData) {
    open var data: SkeletonData
    open var bones: Array<Bone>
    open var slots: Array<Slot>
    open var drawOrder: Array<Slot>
    open var ikConstraints: Array<IkConstraint>
    open var transformConstraints: Array<TransformConstraint>
    open var pathConstraints: Array<PathConstraint>
    open var _updateCache: Array<Updatable>
    open var updateCacheReset: Array<Updatable>
    open var skin: Skin
    open var color: Color
    open var time: Number
    open var scaleX: Number
    open var scaleY: Number
    open var x: Number
    open var y: Number
    open fun updateCache()
    open fun sortIkConstraint(constraint: IkConstraint)
    open fun sortPathConstraint(constraint: PathConstraint)
    open fun sortTransformConstraint(constraint: TransformConstraint)
    open fun sortPathConstraintAttachment(skin: Skin, slotIndex: Number, slotBone: Bone)
    open fun sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone)
    open fun sortBone(bone: Bone)
    open fun sortReset(bones: Array<Bone>)
    open fun updateWorldTransform()
    open fun setToSetupPose()
    open fun setBonesToSetupPose()
    open fun setSlotsToSetupPose()
    open fun getRootBone(): Bone
    open fun findBone(boneName: String): Bone
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): Slot
    open fun findSlotIndex(slotName: String): Number
    open fun setSkinByName(skinName: String)
    open fun setSkin(newSkin: Skin)
    open fun getAttachmentByName(slotName: String, attachmentName: String): Attachment
    open fun getAttachment(slotIndex: Number, attachmentName: String): Attachment
    open fun setAttachment(slotName: String, attachmentName: String)
    open fun findIkConstraint(constraintName: String): IkConstraint
    open fun findTransformConstraint(constraintName: String): TransformConstraint
    open fun findPathConstraint(constraintName: String): PathConstraint
    open fun getBounds(offset: Vector2, size: Vector2, temp: Array<Number> = definedExternally)
    open fun update(delta: Number)
}

external open class SkeletonBinary(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(binary: Uint8Array): SkeletonData
    open var readSkin: Any
    open var readAttachment: Any
    open var readVertices: Any
    open var readFloatArray: Any
    open var readShortArray: Any
    open var readAnimation: Any
    open var readCurve: Any
    open fun setCurve(timeline: CurveTimeline, frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)

    companion object {
        var AttachmentTypeValues: Array<Number>
        var TransformModeValues: Array<TransformMode>
        var PositionModeValues: Array<PositionMode>
        var SpacingModeValues: Array<SpacingMode>
        var RotateModeValues: Array<RotateMode>
        var BlendModeValues: Array<BlendMode>
        var BONE_ROTATE: Number
        var BONE_TRANSLATE: Number
        var BONE_SCALE: Number
        var BONE_SHEAR: Number
        var SLOT_ATTACHMENT: Number
        var SLOT_COLOR: Number
        var SLOT_TWO_COLOR: Number
        var PATH_POSITION: Number
        var PATH_SPACING: Number
        var PATH_MIX: Number
        var CURVE_LINEAR: Number
        var CURVE_STEPPED: Number
        var CURVE_BEZIER: Number
    }
}

external open class SkeletonBounds {
    open var minX: Number
    open var minY: Number
    open var maxX: Number
    open var maxY: Number
    open var boundingBoxes: Array<BoundingBoxAttachment>
    open var polygons: Array<ArrayLike<Number>>
    open var polygonPool: Any
    open fun update(skeleton: Skeleton, updateAabb: Boolean)
    open fun aabbCompute()
    open fun aabbContainsPoint(x: Number, y: Number): Boolean
    open fun aabbIntersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean
    open fun containsPoint(x: Number, y: Number): BoundingBoxAttachment
    open fun containsPointPolygon(polygon: ArrayLike<Number>, x: Number, y: Number): Boolean
    open fun intersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): BoundingBoxAttachment
    open fun intersectsSegmentPolygon(polygon: ArrayLike<Number>, x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike<Number>
    open fun getWidth(): Number
    open fun getHeight(): Number
}

external open class SkeletonClipping {
    open var triangulator: Any
    open var clippingPolygon: Any
    open var clipOutput: Any
    open var clippedVertices: Array<Number>
    open var clippedTriangles: Array<Number>
    open var scratch: Any
    open var clipAttachment: Any
    open var clippingPolygons: Any
    open fun clipStart(slot: Slot, clip: ClippingAttachment): Number
    open fun clipEndWithSlot(slot: Slot)
    open fun clipEnd()
    open fun isClipping(): Boolean
    open fun clipTriangles(vertices: ArrayLike<Number>, verticesLength: Number, triangles: ArrayLike<Number>, trianglesLength: Number, uvs: ArrayLike<Number>, light: Color, dark: Color, twoColor: Boolean)
    open fun clip(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, clippingArea: Array<Number>, output: Array<Number>): Boolean

    companion object {
        fun makeClockwise(polygon: ArrayLike<Number>)
    }
}

external open class SkeletonData {
    open var name: String
    open var bones: Array<BoneData>
    open var slots: Array<SlotData>
    open var skins: Array<Skin>
    open var defaultSkin: Skin
    open var events: Array<EventData>
    open var animations: Array<Animation>
    open var ikConstraints: Array<IkConstraintData>
    open var transformConstraints: Array<TransformConstraintData>
    open var pathConstraints: Array<PathConstraintData>
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var version: String
    open var hash: String
    open var fps: Number
    open var imagesPath: String
    open var audioPath: String
    open fun findBone(boneName: String): BoneData
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): SlotData
    open fun findSlotIndex(slotName: String): Number
    open fun findSkin(skinName: String): Skin
    open fun findEvent(eventDataName: String): EventData
    open fun findAnimation(animationName: String): Animation
    open fun findIkConstraint(constraintName: String): IkConstraintData
    open fun findTransformConstraint(constraintName: String): TransformConstraintData
    open fun findPathConstraint(constraintName: String): PathConstraintData
    open fun findPathConstraintIndex(pathConstraintName: String): Number
}

external open class SkeletonJson(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(json: String): SkeletonData
    open fun readSkeletonData(json: Any): SkeletonData
    open fun readAttachment(map: Any, skin: Skin, slotIndex: Number, name: String, skeletonData: SkeletonData): Attachment
    open fun readVertices(map: Any, attachment: VertexAttachment, verticesLength: Number)
    open fun readAnimation(map: Any, name: String, skeletonData: SkeletonData)
    open fun readCurve(map: Any, timeline: CurveTimeline, frameIndex: Number)
    open fun getValue(map: Any, prop: String, defaultValue: Any): Any

    companion object {
        fun blendModeFromString(str: String): BlendMode
        fun positionModeFromString(str: String): PositionMode
        fun spacingModeFromString(str: String): SpacingMode
        fun rotateModeFromString(str: String): RotateMode
        fun transformModeFromString(str: String): TransformMode
    }
}

external open class SkinEntry(slotIndex: Number, name: String, attachment: Attachment) {
    open var slotIndex: Number
    open var name: String
    open var attachment: Attachment
}

external open class Skin(name: String) {
    open var name: String
    open var attachments: Array<Map<Attachment>>
    open var bones: Array<BoneData>
    open var constraints: Array<ConstraintData>
    open fun setAttachment(slotIndex: Number, name: String, attachment: Attachment)
    open fun addSkin(skin: Skin)
    open fun copySkin(skin: Skin)
    open fun getAttachment(slotIndex: Number, name: String): Attachment
    open fun removeAttachment(slotIndex: Number, name: String)
    open fun getAttachments(): Array<SkinEntry>
    open fun getAttachmentsForSlot(slotIndex: Number, attachments: Array<SkinEntry>)
    open fun clear()
    open fun attachAll(skeleton: Skeleton, oldSkin: Skin)
}

external open class Slot(data: SlotData, bone: Bone) {
    open var data: SlotData
    open var bone: Bone
    open var color: Color
    open var darkColor: Color
    open var attachment: Any
    open var attachmentTime: Any
    open var deform: Array<Number>
    open fun getAttachment(): Attachment
    open fun setAttachment(attachment: Attachment)
    open fun setAttachmentTime(time: Number)
    open fun getAttachmentTime(): Number
    open fun setToSetupPose()
}

external open class SlotData(index: Number, name: String, boneData: BoneData) {
    open var index: Number
    open var name: String
    open var boneData: BoneData
    open var color: Color
    open var darkColor: Color
    open var attachmentName: String
    open var blendMode: BlendMode
}

external open class Texture(image: HTMLImageElement) {
    open var _image: HTMLImageElement
    open fun getImage(): HTMLImageElement
    open fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    open fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    open fun dispose()

    companion object {
        fun filterFromString(text: String): TextureFilter
        fun wrapFromString(text: String): TextureWrap
    }
}

external enum class TextureFilter {
    Nearest /* = 9728 */,
    Linear /* = 9729 */,
    MipMap /* = 9987 */,
    MipMapNearestNearest /* = 9984 */,
    MipMapLinearNearest /* = 9985 */,
    MipMapNearestLinear /* = 9986 */,
    MipMapLinearLinear /* = 9987 */
}

external enum class TextureWrap {
    MirroredRepeat /* = 33648 */,
    ClampToEdge /* = 33071 */,
    Repeat /* = 10497 */
}

external open class TextureRegion {
    open var renderObject: Any
    open var u: Number
    open var v: Number
    open var u2: Number
    open var v2: Number
    open var width: Number
    open var height: Number
    open var rotate: Boolean
    open var offsetX: Number
    open var offsetY: Number
    open var originalWidth: Number
    open var originalHeight: Number
}

external open class FakeTexture(image: HTMLImageElement) : Texture {
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    override fun dispose()
}

external open class TextureAtlas(atlasText: String, textureLoader: (path: String) -> Any) : Disposable {
    open var pages: Array<TextureAtlasPage>
    open var regions: Array<TextureAtlasRegion>
    open var load: Any
    open fun findRegion(name: String): TextureAtlasRegion
    override fun dispose()
}

external open class TextureAtlasPage {
    open var name: String
    open var minFilter: TextureFilter
    open var magFilter: TextureFilter
    open var uWrap: TextureWrap
    open var vWrap: TextureWrap
    open var texture: Texture
    open var width: Number
    open var height: Number
}

external open class TextureAtlasRegion : TextureRegion {
    open var page: TextureAtlasPage
    open var name: String
    open var x: Number
    open var y: Number
    open var index: Number
    override var rotate: Boolean
    open var degrees: Number
    open var texture: Texture
}

external open class TransformConstraint(data: TransformConstraintData, skeleton: Skeleton) : Updatable {
    open var data: TransformConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var temp: Vector2
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun applyAbsoluteWorld()
    open fun applyRelativeWorld()
    open fun applyAbsoluteLocal()
    open fun applyRelativeLocal()
}

external open class TransformConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var offsetRotation: Number
    open var offsetX: Number
    open var offsetY: Number
    open var offsetScaleX: Number
    open var offsetScaleY: Number
    open var offsetShearY: Number
    open var relative: Boolean
    open var local: Boolean
}

external open class Triangulator {
    open var convexPolygons: Any
    open var convexPolygonsIndices: Any
    open var indicesArray: Any
    open var isConcaveArray: Any
    open var triangles: Any
    open var polygonPool: Any
    open var polygonIndicesPool: Any
    open fun triangulate(verticesArray: ArrayLike<Number>): Array<Number>
    open fun decompose(verticesArray: Array<Number>, triangles: Array<Number>): Array<Array<Number>>

    companion object {
        var isConcave: Any
        var positiveArea: Any
        var winding: Any
    }
}

external open class IntSet {
    open var array: Array<Number>
    open fun add(value: Number): Boolean
    open fun contains(value: Number): Boolean
    open fun remove(value: Number)
    open fun clear()
}

external open class Color(r: Number = definedExternally, g: Number = definedExternally, b: Number = definedExternally, a: Number = definedExternally) {
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open fun set(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun setFromColor(c: Color): Color /* this */
    open fun setFromString(hex: String): Color /* this */
    open fun add(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun clamp(): Color /* this */

    companion object {
        var WHITE: Color
        var RED: Color
        var GREEN: Color
        var BLUE: Color
        var MAGENTA: Color
        fun rgba8888ToColor(color: Color, value: Number)
        fun rgb888ToColor(color: Color, value: Number)
    }
}

external open class MathUtils {
    companion object {
        var PI: Number
        var PI2: Number
        var radiansToDegrees: Number
        var radDeg: Number
        var degreesToRadians: Number
        var degRad: Number
        fun clamp(value: Number, min: Number, max: Number): Number
        fun cosDeg(degrees: Number): Number
        fun sinDeg(degrees: Number): Number
        fun signum(value: Number): Number
        fun toInt(x: Number): Number
        fun cbrt(x: Number): Number
        fun randomTriangular(min: Number, max: Number): Number
        fun randomTriangularWith(min: Number, max: Number, mode: Number): Number
    }
}

external open class Interpolation {
    open fun applyInternal(a: Number): Number
    open fun apply(start: Number, end: Number, a: Number): Number
}

external open class Pow(power: Number) : Interpolation {
    open var power: Number
    override fun applyInternal(a: Number): Number
}

external open class PowOut(power: Number) : Pow {
    override fun applyInternal(a: Number): Number
}

external open class Utils {
    companion object {
        var SUPPORTS_TYPED_ARRAYS: Boolean
        fun <T> arrayCopy(source: ArrayLike<T>, sourceStart: Number, dest: ArrayLike<T>, destStart: Number, numElements: Number)
        fun <T> setArraySize(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> ensureArrayCapacity(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> newArray(size: Number, defaultValue: T): Array<T>
        fun newFloatArray(size: Number): ArrayLike<Number>
        fun newShortArray(size: Number): ArrayLike<Number>
        fun toFloatArray(array: Array<Number>): dynamic /* Array<Number> | Float32Array */
        fun toSinglePrecision(value: Number): Number
        fun webkit602BugfixHelper(alpha: Number, blend: MixBlend)
        fun <T> contains(array: Array<T>, element: T, identity: Boolean = definedExternally): Boolean
    }
}

external open class DebugUtils {
    companion object {
        fun logBones(skeleton: Skeleton)
    }
}

external open class Pool<T>(instantiator: () -> T) {
    open var items: Any
    open var instantiator: Any
    open fun obtain(): T
    open fun free(item: T)
    open fun freeAll(items: ArrayLike<T>)
    open fun clear()
}

external open class Vector2(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open fun set(x: Number, y: Number): Vector2
    open fun length(): Number
    open fun normalize(): Vector2 /* this */
}

external open class TimeKeeper {
    open var maxDelta: Number
    open var framesPerSecond: Number
    open var delta: Number
    open var totalTime: Number
    open var lastTime: Any
    open var frameCount: Any
    open var frameTime: Any
    open fun update()
}

external open class WindowedMean(windowSize: Number = definedExternally) {
    open var values: Array<Number>
    open var addedValues: Number
    open var lastValue: Number
    open var mean: Number
    open var dirty: Boolean
    open fun hasEnoughData(): Boolean
    open fun addValue(value: Number)
    open fun getMean(): Number
}

external open class Attachment(name: String) {
    open var name: String
    open fun copy(): Attachment
}

external open class VertexAttachment(name: String) : Attachment {
    open var id: Number
    open var bones: Array<Number>
    open var vertices: ArrayLike<Number>
    open var worldVerticesLength: Number
    open var deformAttachment: VertexAttachment
    open fun computeWorldVertices(slot: Slot, start: Number, count: Number, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    open fun copyTo(attachment: VertexAttachment)

    companion object {
        var nextID: Any
    }
}

external enum class AttachmentType {
    Region /* = 0 */,
    BoundingBox /* = 1 */,
    Mesh /* = 2 */,
    LinkedMesh /* = 3 */,
    Path /* = 4 */,
    Point /* = 5 */,
    Clipping /* = 6 */
}

external open class BoundingBoxAttachment(name: String) : VertexAttachment {
    open var color: Color
    override fun copy(): Attachment
}

external open class ClippingAttachment(name: String) : VertexAttachment {
    open var endSlot: SlotData
    open var color: Color
    override fun copy(): Attachment
}

external open class MeshAttachment(name: String) : VertexAttachment {
    open var region: TextureRegion
    open var path: String
    open var regionUVs: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var triangles: Array<Number>
    open var color: Color
    open var width: Number
    open var height: Number
    open var hullLength: Number
    open var edges: Array<Number>
    open var parentMesh: Any
    open var tempColor: Color
    open fun updateUVs()
    open fun getParentMesh(): MeshAttachment
    open fun setParentMesh(parentMesh: MeshAttachment)
    override fun copy(): Attachment
    open fun newLinkedMesh(): MeshAttachment
}

external open class PathAttachment(name: String) : VertexAttachment {
    open var lengths: Array<Number>
    open var closed: Boolean
    open var constantSpeed: Boolean
    open var color: Color
    override fun copy(): Attachment
}

external open class PointAttachment(name: String) : VertexAttachment {
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var color: Color
    open fun computeWorldPosition(bone: Bone, point: Vector2): Vector2
    open fun computeWorldRotation(bone: Bone): Number
    override fun copy(): Attachment
}

external open class RegionAttachment(name: String) : Attachment {
    open var x: Number
    open var y: Number
    open var scaleX: Number
    open var scaleY: Number
    open var rotation: Number
    open var width: Number
    open var height: Number
    open var color: Color
    open var path: String
    open var rendererObject: Any
    open var region: TextureRegion
    open var offset: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var tempColor: Color
    open fun updateOffset()
    open fun setRegion(region: TextureRegion)
    open fun computeWorldVertices(bone: Bone, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    override fun copy(): Attachment

    companion object {
        var OX1: Number
        var OY1: Number
        var OX2: Number
        var OY2: Number
        var OX3: Number
        var OY3: Number
        var OX4: Number
        var OY4: Number
        var X1: Number
        var Y1: Number
        var C1R: Number
        var C1G: Number
        var C1B: Number
        var C1A: Number
        var U1: Number
        var V1: Number
        var X2: Number
        var Y2: Number
        var C2R: Number
        var C2G: Number
        var C2B: Number
        var C2A: Number
        var U2: Number
        var V2: Number
        var X3: Number
        var Y3: Number
        var C3R: Number
        var C3G: Number
        var C3B: Number
        var C3A: Number
        var U3: Number
        var V3: Number
        var X4: Number
        var Y4: Number
        var C4R: Number
        var C4G: Number
        var C4B: Number
        var C4A: Number
        var U4: Number
        var V4: Number
    }
}

external open class JitterEffect(jitterX: Number, jitterY: Number) : VertexEffect {
    open var jitterX: Number
    open var jitterY: Number
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()
}

external open class SwirlEffect(radius: Number) : VertexEffect {
    open var centerX: Number
    open var centerY: Number
    open var radius: Number
    open var angle: Number
    open var worldX: Any
    open var worldY: Any
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()

    companion object {
        var interpolation: PowOut
    }
}

external open class Animation(name: String, timelines: Array<Timeline>, duration: Number) {
    open var name: String
    open var timelines: Array<Timeline>
    open var timelineIds: Array<Boolean>
    open var duration: Number
    open fun hasTimeline(id: Number): Boolean
    open fun apply(skeleton: Skeleton, lastTime: Number, time: Number, loop: Boolean, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        fun binarySearch(values: ArrayLike<Number>, target: Number, step: Number = definedExternally): Number
        fun linearSearch(values: ArrayLike<Number>, target: Number, step: Number): Number
    }
}

external enum class MixBlend {
    setup /* = 0 */,
    first /* = 1 */,
    replace /* = 2 */,
    add /* = 3 */
}

external enum class MixDirection {
    mixIn /* = 0 */,
    mixOut /* = 1 */
}

external enum class TimelineType {
    rotate /* = 0 */,
    translate /* = 1 */,
    scale /* = 2 */,
    shear /* = 3 */,
    attachment /* = 4 */,
    color /* = 5 */,
    deform /* = 6 */,
    event /* = 7 */,
    drawOrder /* = 8 */,
    ikConstraint /* = 9 */,
    transformConstraint /* = 10 */,
    pathConstraintPosition /* = 11 */,
    pathConstraintSpacing /* = 12 */,
    pathConstraintMix /* = 13 */,
    twoColor /* = 14 */
}

external open class CurveTimeline(frameCount: Number) : Timeline {
    open var curves: Any
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setLinear(frameIndex: Number)
    open fun setStepped(frameIndex: Number)
    open fun getCurveType(frameIndex: Number): Number
    open fun setCurve(frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)
    open fun getCurvePercent(frameIndex: Number, percent: Number): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var LINEAR: Number
        var STEPPED: Number
        var BEZIER: Number
        var BEZIER_SIZE: Number
    }
}

external open class RotateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, degrees: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATION: Number
        var ROTATION: Number
    }
}

external open class TranslateTimeline(frameCount: Number) : CurveTimeline {
    open var boneIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, x: Number, y: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_X: Number
        var PREV_Y: Number
        var X: Number
        var Y: Number
    }
}

external open class ScaleTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ShearTimeline(frameCount: Number) : TranslateTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class ColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
    }
}

external open class TwoColorTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, r: Number, g: Number, b: Number, a: Number, r2: Number, g2: Number, b2: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_R: Number
        var PREV_G: Number
        var PREV_B: Number
        var PREV_A: Number
        var PREV_R2: Number
        var PREV_G2: Number
        var PREV_B2: Number
        var R: Number
        var G: Number
        var B: Number
        var A: Number
        var R2: Number
        var G2: Number
        var B2: Number
    }
}

external open class AttachmentTimeline(frameCount: Number) : Timeline {
    open var slotIndex: Number
    open var frames: ArrayLike<Number>
    open var attachmentNames: Array<String>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, attachmentName: String)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, events: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DeformTimeline(frameCount: Number) : CurveTimeline {
    open var slotIndex: Number
    open var attachment: VertexAttachment
    open var frames: ArrayLike<Number>
    open var frameVertices: Array<ArrayLike<Number>>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, vertices: ArrayLike<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class EventTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var events: Array<Event>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, event: Event)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class DrawOrderTimeline(frameCount: Number) : Timeline {
    open var frames: ArrayLike<Number>
    open var drawOrders: Array<Array<Number>>
    override fun getPropertyId(): Number
    open fun getFrameCount(): Number
    open fun setFrame(frameIndex: Number, time: Number, drawOrder: Array<Number>)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class IkConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var ikConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, mix: Number, softness: Number, bendDirection: Number, compress: Boolean, stretch: Boolean)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_MIX: Number
        var PREV_SOFTNESS: Number
        var PREV_BEND_DIRECTION: Number
        var PREV_COMPRESS: Number
        var PREV_STRETCH: Number
        var MIX: Number
        var SOFTNESS: Number
        var BEND_DIRECTION: Number
        var COMPRESS: Number
        var STRETCH: Number
    }
}

external open class TransformConstraintTimeline(frameCount: Number) : CurveTimeline {
    open var transformConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number, scaleMix: Number, shearMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var PREV_SCALE: Number
        var PREV_SHEAR: Number
        var ROTATE: Number
        var TRANSLATE: Number
        var SCALE: Number
        var SHEAR: Number
    }
}

external open class PathConstraintPositionTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, value: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_VALUE: Number
        var VALUE: Number
    }
}

external open class PathConstraintSpacingTimeline(frameCount: Number) : PathConstraintPositionTimeline {
    override fun getPropertyId(): Number
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)
}

external open class PathConstraintMixTimeline(frameCount: Number) : CurveTimeline {
    open var pathConstraintIndex: Number
    open var frames: ArrayLike<Number>
    override fun getPropertyId(): Number
    open fun setFrame(frameIndex: Number, time: Number, rotateMix: Number, translateMix: Number)
    override fun apply(skeleton: Skeleton, lastTime: Number, time: Number, firedEvents: Array<Event>, alpha: Number, blend: MixBlend, direction: MixDirection)

    companion object {
        var ENTRIES: Number
        var PREV_TIME: Number
        var PREV_ROTATE: Number
        var PREV_TRANSLATE: Number
        var ROTATE: Number
        var TRANSLATE: Number
    }
}

external open class AnimationState(data: AnimationStateData) {
    open var data: AnimationStateData
    open var tracks: Array<TrackEntry>
    open var events: Array<Event>
    open var listeners: Array<AnimationStateListener2>
    open var queue: EventQueue
    open var propertyIDs: IntSet
    open var animationsChanged: Boolean
    open var timeScale: Number
    open var trackEntryPool: Pool<TrackEntry>
    open fun update(delta: Number)
    open fun updateMixingFrom(to: TrackEntry, delta: Number): Boolean
    open fun apply(skeleton: Skeleton): Boolean
    open fun applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Number
    open fun applyRotateTimeline(timeline: Timeline, skeleton: Skeleton, time: Number, alpha: Number, blend: MixBlend, timelinesRotation: Array<Number>, i: Number, firstFrame: Boolean)
    open fun queueEvents(entry: TrackEntry, animationTime: Number)
    open fun clearTracks()
    open fun clearTrack(trackIndex: Number)
    open fun setCurrent(index: Number, current: TrackEntry, interrupt: Boolean)
    open fun setAnimation(trackIndex: Number, animationName: String, loop: Boolean): TrackEntry
    open fun setAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean): TrackEntry
    open fun addAnimation(trackIndex: Number, animationName: String, loop: Boolean, delay: Number): TrackEntry
    open fun addAnimationWith(trackIndex: Number, animation: Animation, loop: Boolean, delay: Number): TrackEntry
    open fun setEmptyAnimation(trackIndex: Number, mixDuration: Number): TrackEntry
    open fun addEmptyAnimation(trackIndex: Number, mixDuration: Number, delay: Number): TrackEntry
    open fun setEmptyAnimations(mixDuration: Number)
    open fun expandToIndex(index: Number): TrackEntry
    open fun trackEntry(trackIndex: Number, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
    open fun disposeNext(entry: TrackEntry)
    open fun _animationsChanged()
    open fun computeHold(entry: TrackEntry)
    open fun computeNotLast(entry: TrackEntry)
    open fun getCurrent(trackIndex: Number): TrackEntry
    open fun addListener(listener: AnimationStateListener2)
    open fun removeListener(listener: AnimationStateListener2)
    open fun clearListeners()
    open fun clearListenerNotifications()

    companion object {
        var emptyAnimation: Animation
        var SUBSEQUENT: Number
        var FIRST: Number
        var HOLD: Number
        var HOLD_MIX: Number
        var NOT_LAST: Number
    }
}

external open class TrackEntry {
    open var animation: Animation
    open var next: TrackEntry
    open var mixingFrom: TrackEntry
    open var mixingTo: TrackEntry
    open var listener: AnimationStateListener2
    open var trackIndex: Number
    open var loop: Boolean
    open var holdPrevious: Boolean
    open var eventThreshold: Number
    open var attachmentThreshold: Number
    open var drawOrderThreshold: Number
    open var animationStart: Number
    open var animationEnd: Number
    open var animationLast: Number
    open var nextAnimationLast: Number
    open var delay: Number
    open var trackTime: Number
    open var trackLast: Number
    open var nextTrackLast: Number
    open var trackEnd: Number
    open var timeScale: Number
    open var alpha: Number
    open var mixTime: Number
    open var mixDuration: Number
    open var interruptAlpha: Number
    open var totalAlpha: Number
    open var mixBlend: MixBlend
    open var timelineMode: Array<Number>
    open var timelineHoldMix: Array<TrackEntry>
    open var timelinesRotation: Array<Number>
    open fun reset()
    open fun getAnimationTime(): Number
    open fun setAnimationLast(animationLast: Number)
    open fun isComplete(): Boolean
    open fun resetRotationDirections()
}

external open class EventQueue(animState: AnimationState) {
    open var objects: Array<Any>
    open var drainDisabled: Boolean
    open var animState: AnimationState
    open fun start(entry: TrackEntry)
    open fun interrupt(entry: TrackEntry)
    open fun end(entry: TrackEntry)
    open fun dispose(entry: TrackEntry)
    open fun complete(entry: TrackEntry)
    open fun event(entry: TrackEntry, event: Event)
    open fun drain()
    open fun clear()
}

external enum class EventType {
    start /* = 0 */,
    interrupt /* = 1 */,
    end /* = 2 */,
    dispose /* = 3 */,
    complete /* = 4 */,
    event /* = 5 */
}

external open class AnimationStateAdapter2 : AnimationStateListener2 {
    override fun start(entry: TrackEntry)
    override fun interrupt(entry: TrackEntry)
    override fun end(entry: TrackEntry)
    override fun dispose(entry: TrackEntry)
    override fun complete(entry: TrackEntry)
    override fun event(entry: TrackEntry, event: Event)
}

external open class AnimationStateData(skeletonData: SkeletonData) {
    open var skeletonData: SkeletonData
    open var animationToMixTime: Map<Number>
    open var defaultMix: Number
    open fun setMix(fromName: String, toName: String, duration: Number)
    open fun setMixWith(from: Animation, to: Animation, duration: Number)
    open fun getMix(from: Animation, to: Animation): Number
}

external open class AssetManager(textureLoader: (image: HTMLImageElement) -> Any, pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var textureLoader: Any
    open var assets: Any
    open var errors: Any
    open var toLoad: Any
    open var loaded: Any
    open fun loadBinary(path: String, success: (path: String, binary: Uint8Array) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadText(path: String, success: (path: String, text: String) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTexture(path: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureData(path: String, data: String, success: (path: String, image: HTMLImageElement) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun loadTextureAtlas(path: String, success: (path: String, atlas: TextureAtlas) -> Unit = definedExternally, error: (path: String, error: String) -> Unit = definedExternally)
    open fun get(path: String): Any
    open fun remove(path: String)
    open fun removeAll()
    open fun isLoadingComplete(): Boolean
    open fun getToLoad(): Number
    open fun getLoaded(): Number
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>

    companion object {
        var downloadText: Any
        var downloadBinary: Any
    }
}

external open class AtlasAttachmentLoader(atlas: TextureAtlas) : AttachmentLoader {
    open var atlas: TextureAtlas
    override fun newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
    override fun newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
    override fun newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
    override fun newPathAttachment(skin: Skin, name: String): PathAttachment
    override fun newPointAttachment(skin: Skin, name: String): PointAttachment
    override fun newClippingAttachment(skin: Skin, name: String): ClippingAttachment
}

external enum class BlendMode {
    Normal /* = 0 */,
    Additive /* = 1 */,
    Multiply /* = 2 */,
    Screen /* = 3 */
}

external open class Bone(data: BoneData, skeleton: Skeleton, parent: Bone) : Updatable {
    open var data: BoneData
    open var skeleton: Skeleton
    open var parent: Bone
    open var children: Array<Bone>
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var ax: Number
    open var ay: Number
    open var arotation: Number
    open var ascaleX: Number
    open var ascaleY: Number
    open var ashearX: Number
    open var ashearY: Number
    open var appliedValid: Boolean
    open var a: Number
    open var b: Number
    open var worldX: Number
    open var c: Number
    open var d: Number
    open var worldY: Number
    open var sorted: Boolean
    open var active: Boolean
    override fun isActive(): Boolean
    override fun update()
    open fun updateWorldTransform()
    open fun updateWorldTransformWith(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number, shearX: Number, shearY: Number)
    open fun setToSetupPose()
    open fun getWorldRotationX(): Number
    open fun getWorldRotationY(): Number
    open fun getWorldScaleX(): Number
    open fun getWorldScaleY(): Number
    open fun updateAppliedTransform()
    open fun worldToLocal(world: Vector2): Vector2
    open fun localToWorld(local: Vector2): Vector2
    open fun worldToLocalRotation(worldRotation: Number): Number
    open fun localToWorldRotation(localRotation: Number): Number
    open fun rotateWorld(degrees: Number)
}

external open class BoneData(index: Number, name: String, parent: BoneData) {
    open var index: Number
    open var name: String
    open var parent: BoneData
    open var length: Number
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var scaleX: Number
    open var scaleY: Number
    open var shearX: Number
    open var shearY: Number
    open var transformMode: TransformMode
    open var skinRequired: Boolean
    open var color: Color
}

external enum class TransformMode {
    Normal /* = 0 */,
    OnlyTranslation /* = 1 */,
    NoRotationOrReflection /* = 2 */,
    NoScale /* = 3 */,
    NoScaleOrReflection /* = 4 */
}

external open class ConstraintData(name: String, order: Number, skinRequired: Boolean) {
    open var name: String
    open var order: Number
    open var skinRequired: Boolean
}

external open class Event(time: Number, data: EventData) {
    open var data: EventData
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var time: Number
    open var volume: Number
    open var balance: Number
}

external open class EventData(name: String) {
    open var name: String
    open var intValue: Number
    open var floatValue: Number
    open var stringValue: String
    open var audioPath: String
    open var volume: Number
    open var balance: Number
}

external open class IkConstraint(data: IkConstraintData, skeleton: Skeleton) : Updatable {
    open var data: IkConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var mix: Number
    open var softness: Number
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun apply1(bone: Bone, targetX: Number, targetY: Number, compress: Boolean, stretch: Boolean, uniform: Boolean, alpha: Number)
    open fun apply2(parent: Bone, child: Bone, targetX: Number, targetY: Number, bendDir: Number, stretch: Boolean, softness: Number, alpha: Number)
}

external open class IkConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var bendDirection: Number
    open var compress: Boolean
    open var stretch: Boolean
    open var uniform: Boolean
    open var mix: Number
    open var softness: Number
}

external open class PathConstraint(data: PathConstraintData, skeleton: Skeleton) : Updatable {
    open var data: PathConstraintData
    open var bones: Array<Bone>
    open var target: Slot
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
    open var spaces: Array<Number>
    open var positions: Array<Number>
    open var world: Array<Number>
    open var curves: Array<Number>
    open var lengths: Array<Number>
    open var segments: Array<Number>
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun computeWorldPositions(path: PathAttachment, spacesCount: Number, tangents: Boolean, percentPosition: Boolean, percentSpacing: Boolean): Array<Number>
    open fun addBeforePosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addAfterPosition(p: Number, temp: Array<Number>, i: Number, out: Array<Number>, o: Number)
    open fun addCurvePosition(p: Number, x1: Number, y1: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number, x2: Number, y2: Number, out: Array<Number>, o: Number, tangents: Boolean)

    companion object {
        var NONE: Number
        var BEFORE: Number
        var AFTER: Number
        var epsilon: Number
    }
}

external open class PathConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: SlotData
    open var positionMode: PositionMode
    open var spacingMode: SpacingMode
    open var rotateMode: RotateMode
    open var offsetRotation: Number
    open var position: Number
    open var spacing: Number
    open var rotateMix: Number
    open var translateMix: Number
}

external enum class PositionMode {
    Fixed /* = 0 */,
    Percent /* = 1 */
}

external enum class SpacingMode {
    Length /* = 0 */,
    Fixed /* = 1 */,
    Percent /* = 2 */
}

external enum class RotateMode {
    Tangent /* = 0 */,
    Chain /* = 1 */,
    ChainScale /* = 2 */
}

external open class SharedAssetManager(pathPrefix: String = definedExternally) : Disposable {
    open var pathPrefix: Any
    open var clientAssets: Any
    open var queuedAssets: Any
    open var rawAssets: Any
    open var errors: Any
    open var queueAsset: Any
    open fun loadText(clientId: String, path: String)
    open fun loadJson(clientId: String, path: String)
    open fun loadTexture(clientId: String, textureLoader: (image: HTMLImageElement) -> Any, path: String)
    open fun get(clientId: String, path: String): Any
    open var updateClientAssets: Any
    open fun isLoadingComplete(clientId: String): Boolean
    override fun dispose()
    open fun hasErrors(): Boolean
    open fun getErrors(): Map<String>
}

external open class Skeleton(data: SkeletonData) {
    open var data: SkeletonData
    open var bones: Array<Bone>
    open var slots: Array<Slot>
    open var drawOrder: Array<Slot>
    open var ikConstraints: Array<IkConstraint>
    open var transformConstraints: Array<TransformConstraint>
    open var pathConstraints: Array<PathConstraint>
    open var _updateCache: Array<Updatable>
    open var updateCacheReset: Array<Updatable>
    open var skin: Skin
    open var color: Color
    open var time: Number
    open var scaleX: Number
    open var scaleY: Number
    open var x: Number
    open var y: Number
    open fun updateCache()
    open fun sortIkConstraint(constraint: IkConstraint)
    open fun sortPathConstraint(constraint: PathConstraint)
    open fun sortTransformConstraint(constraint: TransformConstraint)
    open fun sortPathConstraintAttachment(skin: Skin, slotIndex: Number, slotBone: Bone)
    open fun sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone)
    open fun sortBone(bone: Bone)
    open fun sortReset(bones: Array<Bone>)
    open fun updateWorldTransform()
    open fun setToSetupPose()
    open fun setBonesToSetupPose()
    open fun setSlotsToSetupPose()
    open fun getRootBone(): Bone
    open fun findBone(boneName: String): Bone
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): Slot
    open fun findSlotIndex(slotName: String): Number
    open fun setSkinByName(skinName: String)
    open fun setSkin(newSkin: Skin)
    open fun getAttachmentByName(slotName: String, attachmentName: String): Attachment
    open fun getAttachment(slotIndex: Number, attachmentName: String): Attachment
    open fun setAttachment(slotName: String, attachmentName: String)
    open fun findIkConstraint(constraintName: String): IkConstraint
    open fun findTransformConstraint(constraintName: String): TransformConstraint
    open fun findPathConstraint(constraintName: String): PathConstraint
    open fun getBounds(offset: Vector2, size: Vector2, temp: Array<Number> = definedExternally)
    open fun update(delta: Number)
}

external open class SkeletonBinary(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(binary: Uint8Array): SkeletonData
    open var readSkin: Any
    open var readAttachment: Any
    open var readVertices: Any
    open var readFloatArray: Any
    open var readShortArray: Any
    open var readAnimation: Any
    open var readCurve: Any
    open fun setCurve(timeline: CurveTimeline, frameIndex: Number, cx1: Number, cy1: Number, cx2: Number, cy2: Number)

    companion object {
        var AttachmentTypeValues: Array<Number>
        var TransformModeValues: Array<TransformMode>
        var PositionModeValues: Array<PositionMode>
        var SpacingModeValues: Array<SpacingMode>
        var RotateModeValues: Array<RotateMode>
        var BlendModeValues: Array<BlendMode>
        var BONE_ROTATE: Number
        var BONE_TRANSLATE: Number
        var BONE_SCALE: Number
        var BONE_SHEAR: Number
        var SLOT_ATTACHMENT: Number
        var SLOT_COLOR: Number
        var SLOT_TWO_COLOR: Number
        var PATH_POSITION: Number
        var PATH_SPACING: Number
        var PATH_MIX: Number
        var CURVE_LINEAR: Number
        var CURVE_STEPPED: Number
        var CURVE_BEZIER: Number
    }
}

external open class SkeletonBounds {
    open var minX: Number
    open var minY: Number
    open var maxX: Number
    open var maxY: Number
    open var boundingBoxes: Array<BoundingBoxAttachment>
    open var polygons: Array<ArrayLike<Number>>
    open var polygonPool: Any
    open fun update(skeleton: Skeleton, updateAabb: Boolean)
    open fun aabbCompute()
    open fun aabbContainsPoint(x: Number, y: Number): Boolean
    open fun aabbIntersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun aabbIntersectsSkeleton(bounds: SkeletonBounds): Boolean
    open fun containsPoint(x: Number, y: Number): BoundingBoxAttachment
    open fun containsPointPolygon(polygon: ArrayLike<Number>, x: Number, y: Number): Boolean
    open fun intersectsSegment(x1: Number, y1: Number, x2: Number, y2: Number): BoundingBoxAttachment
    open fun intersectsSegmentPolygon(polygon: ArrayLike<Number>, x1: Number, y1: Number, x2: Number, y2: Number): Boolean
    open fun getPolygon(boundingBox: BoundingBoxAttachment): ArrayLike<Number>
    open fun getWidth(): Number
    open fun getHeight(): Number
}

external open class SkeletonClipping {
    open var triangulator: Any
    open var clippingPolygon: Any
    open var clipOutput: Any
    open var clippedVertices: Array<Number>
    open var clippedTriangles: Array<Number>
    open var scratch: Any
    open var clipAttachment: Any
    open var clippingPolygons: Any
    open fun clipStart(slot: Slot, clip: ClippingAttachment): Number
    open fun clipEndWithSlot(slot: Slot)
    open fun clipEnd()
    open fun isClipping(): Boolean
    open fun clipTriangles(vertices: ArrayLike<Number>, verticesLength: Number, triangles: ArrayLike<Number>, trianglesLength: Number, uvs: ArrayLike<Number>, light: Color, dark: Color, twoColor: Boolean)
    open fun clip(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, clippingArea: Array<Number>, output: Array<Number>): Boolean

    companion object {
        fun makeClockwise(polygon: ArrayLike<Number>)
    }
}

external open class SkeletonData {
    open var name: String
    open var bones: Array<BoneData>
    open var slots: Array<SlotData>
    open var skins: Array<Skin>
    open var defaultSkin: Skin
    open var events: Array<EventData>
    open var animations: Array<Animation>
    open var ikConstraints: Array<IkConstraintData>
    open var transformConstraints: Array<TransformConstraintData>
    open var pathConstraints: Array<PathConstraintData>
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var version: String
    open var hash: String
    open var fps: Number
    open var imagesPath: String
    open var audioPath: String
    open fun findBone(boneName: String): BoneData
    open fun findBoneIndex(boneName: String): Number
    open fun findSlot(slotName: String): SlotData
    open fun findSlotIndex(slotName: String): Number
    open fun findSkin(skinName: String): Skin
    open fun findEvent(eventDataName: String): EventData
    open fun findAnimation(animationName: String): Animation
    open fun findIkConstraint(constraintName: String): IkConstraintData
    open fun findTransformConstraint(constraintName: String): TransformConstraintData
    open fun findPathConstraint(constraintName: String): PathConstraintData
    open fun findPathConstraintIndex(pathConstraintName: String): Number
}

external open class SkeletonJson(attachmentLoader: AttachmentLoader) {
    open var attachmentLoader: AttachmentLoader
    open var scale: Number
    open var linkedMeshes: Any
    open fun readSkeletonData(json: String): SkeletonData
    open fun readSkeletonData(json: Any): SkeletonData
    open fun readAttachment(map: Any, skin: Skin, slotIndex: Number, name: String, skeletonData: SkeletonData): Attachment
    open fun readVertices(map: Any, attachment: VertexAttachment, verticesLength: Number)
    open fun readAnimation(map: Any, name: String, skeletonData: SkeletonData)
    open fun readCurve(map: Any, timeline: CurveTimeline, frameIndex: Number)
    open fun getValue(map: Any, prop: String, defaultValue: Any): Any

    companion object {
        fun blendModeFromString(str: String): BlendMode
        fun positionModeFromString(str: String): PositionMode
        fun spacingModeFromString(str: String): SpacingMode
        fun rotateModeFromString(str: String): RotateMode
        fun transformModeFromString(str: String): TransformMode
    }
}

external open class SkinEntry(slotIndex: Number, name: String, attachment: Attachment) {
    open var slotIndex: Number
    open var name: String
    open var attachment: Attachment
}

external open class Skin(name: String) {
    open var name: String
    open var attachments: Array<Map<Attachment>>
    open var bones: Array<BoneData>
    open var constraints: Array<ConstraintData>
    open fun setAttachment(slotIndex: Number, name: String, attachment: Attachment)
    open fun addSkin(skin: Skin)
    open fun copySkin(skin: Skin)
    open fun getAttachment(slotIndex: Number, name: String): Attachment
    open fun removeAttachment(slotIndex: Number, name: String)
    open fun getAttachments(): Array<SkinEntry>
    open fun getAttachmentsForSlot(slotIndex: Number, attachments: Array<SkinEntry>)
    open fun clear()
    open fun attachAll(skeleton: Skeleton, oldSkin: Skin)
}

external open class Slot(data: SlotData, bone: Bone) {
    open var data: SlotData
    open var bone: Bone
    open var color: Color
    open var darkColor: Color
    open var attachment: Any
    open var attachmentTime: Any
    open var deform: Array<Number>
    open fun getAttachment(): Attachment
    open fun setAttachment(attachment: Attachment)
    open fun setAttachmentTime(time: Number)
    open fun getAttachmentTime(): Number
    open fun setToSetupPose()
}

external open class SlotData(index: Number, name: String, boneData: BoneData) {
    open var index: Number
    open var name: String
    open var boneData: BoneData
    open var color: Color
    open var darkColor: Color
    open var attachmentName: String
    open var blendMode: BlendMode
}

external open class Texture(image: HTMLImageElement) {
    open var _image: HTMLImageElement
    open fun getImage(): HTMLImageElement
    open fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    open fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    open fun dispose()

    companion object {
        fun filterFromString(text: String): TextureFilter
        fun wrapFromString(text: String): TextureWrap
    }
}

external enum class TextureFilter {
    Nearest /* = 9728 */,
    Linear /* = 9729 */,
    MipMap /* = 9987 */,
    MipMapNearestNearest /* = 9984 */,
    MipMapLinearNearest /* = 9985 */,
    MipMapNearestLinear /* = 9986 */,
    MipMapLinearLinear /* = 9987 */
}

external enum class TextureWrap {
    MirroredRepeat /* = 33648 */,
    ClampToEdge /* = 33071 */,
    Repeat /* = 10497 */
}

external open class TextureRegion {
    open var renderObject: Any
    open var u: Number
    open var v: Number
    open var u2: Number
    open var v2: Number
    open var width: Number
    open var height: Number
    open var rotate: Boolean
    open var offsetX: Number
    open var offsetY: Number
    open var originalWidth: Number
    open var originalHeight: Number
}

external open class FakeTexture(image: HTMLImageElement) : Texture {
    override fun setFilters(minFilter: TextureFilter, magFilter: TextureFilter)
    override fun setWraps(uWrap: TextureWrap, vWrap: TextureWrap)
    override fun dispose()
}

external open class TextureAtlas(atlasText: String, textureLoader: (path: String) -> Any) : Disposable {
    open var pages: Array<TextureAtlasPage>
    open var regions: Array<TextureAtlasRegion>
    open var load: Any
    open fun findRegion(name: String): TextureAtlasRegion
    override fun dispose()
}

external open class TextureAtlasPage {
    open var name: String
    open var minFilter: TextureFilter
    open var magFilter: TextureFilter
    open var uWrap: TextureWrap
    open var vWrap: TextureWrap
    open var texture: Texture
    open var width: Number
    open var height: Number
}

external open class TextureAtlasRegion : TextureRegion {
    open var page: TextureAtlasPage
    open var name: String
    open var x: Number
    open var y: Number
    open var index: Number
    override var rotate: Boolean
    open var degrees: Number
    open var texture: Texture
}

external open class TransformConstraint(data: TransformConstraintData, skeleton: Skeleton) : Updatable {
    open var data: TransformConstraintData
    open var bones: Array<Bone>
    open var target: Bone
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var temp: Vector2
    open var active: Boolean
    override fun isActive(): Boolean
    open fun apply()
    override fun update()
    open fun applyAbsoluteWorld()
    open fun applyRelativeWorld()
    open fun applyAbsoluteLocal()
    open fun applyRelativeLocal()
}

external open class TransformConstraintData(name: String) : ConstraintData {
    open var bones: Array<BoneData>
    open var target: BoneData
    open var rotateMix: Number
    open var translateMix: Number
    open var scaleMix: Number
    open var shearMix: Number
    open var offsetRotation: Number
    open var offsetX: Number
    open var offsetY: Number
    open var offsetScaleX: Number
    open var offsetScaleY: Number
    open var offsetShearY: Number
    open var relative: Boolean
    open var local: Boolean
}

external open class Triangulator {
    open var convexPolygons: Any
    open var convexPolygonsIndices: Any
    open var indicesArray: Any
    open var isConcaveArray: Any
    open var triangles: Any
    open var polygonPool: Any
    open var polygonIndicesPool: Any
    open fun triangulate(verticesArray: ArrayLike<Number>): Array<Number>
    open fun decompose(verticesArray: Array<Number>, triangles: Array<Number>): Array<Array<Number>>

    companion object {
        var isConcave: Any
        var positiveArea: Any
        var winding: Any
    }
}

external open class IntSet {
    open var array: Array<Number>
    open fun add(value: Number): Boolean
    open fun contains(value: Number): Boolean
    open fun remove(value: Number)
    open fun clear()
}

external open class Color(r: Number = definedExternally, g: Number = definedExternally, b: Number = definedExternally, a: Number = definedExternally) {
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open fun set(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun setFromColor(c: Color): Color /* this */
    open fun setFromString(hex: String): Color /* this */
    open fun add(r: Number, g: Number, b: Number, a: Number): Color /* this */
    open fun clamp(): Color /* this */

    companion object {
        var WHITE: Color
        var RED: Color
        var GREEN: Color
        var BLUE: Color
        var MAGENTA: Color
        fun rgba8888ToColor(color: Color, value: Number)
        fun rgb888ToColor(color: Color, value: Number)
    }
}

external open class MathUtils {
    companion object {
        var PI: Number
        var PI2: Number
        var radiansToDegrees: Number
        var radDeg: Number
        var degreesToRadians: Number
        var degRad: Number
        fun clamp(value: Number, min: Number, max: Number): Number
        fun cosDeg(degrees: Number): Number
        fun sinDeg(degrees: Number): Number
        fun signum(value: Number): Number
        fun toInt(x: Number): Number
        fun cbrt(x: Number): Number
        fun randomTriangular(min: Number, max: Number): Number
        fun randomTriangularWith(min: Number, max: Number, mode: Number): Number
    }
}

external open class Interpolation {
    open fun applyInternal(a: Number): Number
    open fun apply(start: Number, end: Number, a: Number): Number
}

external open class Pow(power: Number) : Interpolation {
    open var power: Number
    override fun applyInternal(a: Number): Number
}

external open class PowOut(power: Number) : Pow {
    override fun applyInternal(a: Number): Number
}

external open class Utils {
    companion object {
        var SUPPORTS_TYPED_ARRAYS: Boolean
        fun <T> arrayCopy(source: ArrayLike<T>, sourceStart: Number, dest: ArrayLike<T>, destStart: Number, numElements: Number)
        fun <T> setArraySize(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> ensureArrayCapacity(array: Array<T>, size: Number, value: Any = definedExternally): Array<T>
        fun <T> newArray(size: Number, defaultValue: T): Array<T>
        fun newFloatArray(size: Number): ArrayLike<Number>
        fun newShortArray(size: Number): ArrayLike<Number>
        fun toFloatArray(array: Array<Number>): dynamic /* Array<Number> | Float32Array */
        fun toSinglePrecision(value: Number): Number
        fun webkit602BugfixHelper(alpha: Number, blend: MixBlend)
        fun <T> contains(array: Array<T>, element: T, identity: Boolean = definedExternally): Boolean
    }
}

external open class DebugUtils {
    companion object {
        fun logBones(skeleton: Skeleton)
    }
}

external open class Pool<T>(instantiator: () -> T) {
    open var items: Any
    open var instantiator: Any
    open fun obtain(): T
    open fun free(item: T)
    open fun freeAll(items: ArrayLike<T>)
    open fun clear()
}

external open class Vector2(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open fun set(x: Number, y: Number): Vector2
    open fun length(): Number
    open fun normalize(): Vector2 /* this */
}

external open class TimeKeeper {
    open var maxDelta: Number
    open var framesPerSecond: Number
    open var delta: Number
    open var totalTime: Number
    open var lastTime: Any
    open var frameCount: Any
    open var frameTime: Any
    open fun update()
}

external open class WindowedMean(windowSize: Number = definedExternally) {
    open var values: Array<Number>
    open var addedValues: Number
    open var lastValue: Number
    open var mean: Number
    open var dirty: Boolean
    open fun hasEnoughData(): Boolean
    open fun addValue(value: Number)
    open fun getMean(): Number
}

external open class Attachment(name: String) {
    open var name: String
    open fun copy(): Attachment
}

external open class VertexAttachment(name: String) : Attachment {
    open var id: Number
    open var bones: Array<Number>
    open var vertices: ArrayLike<Number>
    open var worldVerticesLength: Number
    open var deformAttachment: VertexAttachment
    open fun computeWorldVertices(slot: Slot, start: Number, count: Number, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    open fun copyTo(attachment: VertexAttachment)

    companion object {
        var nextID: Any
    }
}

external enum class AttachmentType {
    Region /* = 0 */,
    BoundingBox /* = 1 */,
    Mesh /* = 2 */,
    LinkedMesh /* = 3 */,
    Path /* = 4 */,
    Point /* = 5 */,
    Clipping /* = 6 */
}

external open class BoundingBoxAttachment(name: String) : VertexAttachment {
    open var color: Color
    override fun copy(): Attachment
}

external open class ClippingAttachment(name: String) : VertexAttachment {
    open var endSlot: SlotData
    open var color: Color
    override fun copy(): Attachment
}

external open class MeshAttachment(name: String) : VertexAttachment {
    open var region: TextureRegion
    open var path: String
    open var regionUVs: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var triangles: Array<Number>
    open var color: Color
    open var width: Number
    open var height: Number
    open var hullLength: Number
    open var edges: Array<Number>
    open var parentMesh: Any
    open var tempColor: Color
    open fun updateUVs()
    open fun getParentMesh(): MeshAttachment
    open fun setParentMesh(parentMesh: MeshAttachment)
    override fun copy(): Attachment
    open fun newLinkedMesh(): MeshAttachment
}

external open class PathAttachment(name: String) : VertexAttachment {
    open var lengths: Array<Number>
    open var closed: Boolean
    open var constantSpeed: Boolean
    open var color: Color
    override fun copy(): Attachment
}

external open class PointAttachment(name: String) : VertexAttachment {
    open var x: Number
    open var y: Number
    open var rotation: Number
    open var color: Color
    open fun computeWorldPosition(bone: Bone, point: Vector2): Vector2
    open fun computeWorldRotation(bone: Bone): Number
    override fun copy(): Attachment
}

external open class RegionAttachment(name: String) : Attachment {
    open var x: Number
    open var y: Number
    open var scaleX: Number
    open var scaleY: Number
    open var rotation: Number
    open var width: Number
    open var height: Number
    open var color: Color
    open var path: String
    open var rendererObject: Any
    open var region: TextureRegion
    open var offset: ArrayLike<Number>
    open var uvs: ArrayLike<Number>
    open var tempColor: Color
    open fun updateOffset()
    open fun setRegion(region: TextureRegion)
    open fun computeWorldVertices(bone: Bone, worldVertices: ArrayLike<Number>, offset: Number, stride: Number)
    override fun copy(): Attachment

    companion object {
        var OX1: Number
        var OY1: Number
        var OX2: Number
        var OY2: Number
        var OX3: Number
        var OY3: Number
        var OX4: Number
        var OY4: Number
        var X1: Number
        var Y1: Number
        var C1R: Number
        var C1G: Number
        var C1B: Number
        var C1A: Number
        var U1: Number
        var V1: Number
        var X2: Number
        var Y2: Number
        var C2R: Number
        var C2G: Number
        var C2B: Number
        var C2A: Number
        var U2: Number
        var V2: Number
        var X3: Number
        var Y3: Number
        var C3R: Number
        var C3G: Number
        var C3B: Number
        var C3A: Number
        var U3: Number
        var V3: Number
        var X4: Number
        var Y4: Number
        var C4R: Number
        var C4G: Number
        var C4B: Number
        var C4A: Number
        var U4: Number
        var V4: Number
    }
}

external open class JitterEffect(jitterX: Number, jitterY: Number) : VertexEffect {
    open var jitterX: Number
    open var jitterY: Number
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()
}

external open class SwirlEffect(radius: Number) : VertexEffect {
    open var centerX: Number
    open var centerY: Number
    open var radius: Number
    open var angle: Number
    open var worldX: Any
    open var worldY: Any
    override fun begin(skeleton: Skeleton)
    override fun transform(position: Vector2, uv: Vector2, light: Color, dark: Color)
    override fun end()

    companion object {
        var interpolation: PowOut
    }
}