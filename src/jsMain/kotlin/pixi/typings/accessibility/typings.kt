@file:JsModule("@pixi/accessibility")

package pixi.typings.accessibility

import org.w3c.dom.HTMLElement
import pixi.typings.core.AbstractRenderer
import pixi.typings.core.Renderer
import pixi.typings.display.DisplayObject
import pixi.typings.math.Rectangle

open external class AccessibilityManager(renderer: Renderer) {
	constructor(renderer: AbstractRenderer)
	
	var debug: Boolean
	var renderer: dynamic /* AbstractRenderer | Renderer */
	val isActive: Boolean
	val isMobileAccessibility: Boolean
	fun updateDebugHTML(div: IAccessibleHTMLElement)
	fun capHitArea(hitArea: Rectangle)
	fun destroy()
}

external val accessibleTarget: IAccessibleTarget

abstract external class IAccessibleHTMLElement : HTMLElement {
	abstract var type: String?
	abstract var displayObject: DisplayObject?
}

external interface IAccessibleTarget {
	var accessible: Boolean
	var accessibleTitle: String
	var accessibleHint: String
	var tabIndex: Number
	var _accessibleActive: Boolean
	var _accessibleDiv: IAccessibleHTMLElement
	var accessibleType: String
	var accessiblePointerEvents: pixi.typings.accessibility.PointerEvents
	var accessibleChildren: Boolean /* true */
	var renderId: Number
}
