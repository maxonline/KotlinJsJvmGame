@file:JsQualifier("Phaser.Physics.Arcade.Tilemap")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Phaser.Physics.Arcade.Tilemap

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
import Phaser.Tilemaps.Tile
import Phaser.GameObjects.Sprite
import Phaser.Physics.Arcade.Body
import Phaser.Geom.Rectangle
import Phaser.Tilemaps.DynamicTilemapLayer
import Phaser.Tilemaps.StaticTilemapLayer

external fun ProcessTileCallbacks(tile: Tile, sprite: Sprite): Boolean

external fun ProcessTileSeparationX(body: Body, x: Number)

external fun ProcessTileSeparationY(body: Body, y: Number)

external fun SeparateTile(i: Number, body: Body, tile: Tile, tileWorldRect: Rectangle, tilemapLayer: DynamicTilemapLayer, tileBias: Number, isLayer: Boolean): Boolean

external fun SeparateTile(i: Number, body: Body, tile: Tile, tileWorldRect: Rectangle, tilemapLayer: StaticTilemapLayer, tileBias: Number, isLayer: Boolean): Boolean

external fun TileCheckX(body: Body, tile: Tile, tileLeft: Number, tileRight: Number, tileBias: Number, isLayer: Boolean): Number

external fun TileCheckY(body: Body, tile: Tile, tileTop: Number, tileBottom: Number, tileBias: Number, isLayer: Boolean): Number

external fun TileIntersectsBody(tileWorldRect: Any, body: Body): Boolean