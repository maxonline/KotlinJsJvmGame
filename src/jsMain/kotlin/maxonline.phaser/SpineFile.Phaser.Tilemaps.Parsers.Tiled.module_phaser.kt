@file:JsQualifier("Phaser.Tilemaps.Parsers.Tiled")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Tilemaps.Parsers.Tiled

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
import Phaser.Tilemaps.MapData
import Phaser.Types.Tilemaps.GIDData
import Phaser.Tilemaps.LayerData

external fun AssignTileProperties(mapData: MapData)

external fun Base64Decode(data: Any?): Array<Any>

external fun BuildTilesetIndex(mapData: MapData): Array<Any>

external fun CreateGroupLayer(json: Any?, currentl: Any? = definedExternally, parentstate: Any? = definedExternally): Any?

external fun ParseGID(gid: Number): GIDData

external fun ParseImageLayers(json: Any?): Array<Any>

external fun ParseJSONTiled(name: String, json: Any?, insertNull: Boolean): MapData

external fun ParseObject(tiledObject: Any?, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Any?

external fun ParseObjectLayers(json: Any?): Array<Any>

external fun ParseTileLayers(json: Any?, insertNull: Boolean): Array<LayerData>

external fun ParseTilesets(json: Any?): Any?