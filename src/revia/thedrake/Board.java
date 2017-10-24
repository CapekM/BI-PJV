/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revia.thedrake;

/**
 *
 * @author Martin
 */
public class Board {
    private final Tile[][] tiles;

public Board(int dimension, Tile... tiles) {
    this.tiles = new Tile[dimension][];
    for (int i = 0; i < dimension; i++) {
        this.tiles[i] = new Tile[dimension];
        for (int x = 0; x < dimension; x++) {
            this.tiles[i][x] = new EmptyTile(new TilePosition(i, x));
        }
    }

        // NOT SURE //
    for (Tile tile : tiles) {
        this.tiles[tile.position().x()][tile.position().y()] = tile;
    }
}
 
public int dimension() {
    return this.tiles.length;
}
 
// Vrací dlaždici na zvolené pozici. Pokud je pozice mimo desku, vyhazuje IllegalArgumentException
public Tile tileAt(TilePosition position) {
    if ( position.x() > this.tiles.length || position.y() > this.tiles.length )
        throw new IllegalArgumentException("Mimo pole.");
    return this.tiles[position.x()][position.y()];
}
 
// Ověřuje, že pozice se nachází na hrací desce
public boolean contains(TilePosition... positions) {//HERE 
    for (TilePosition position : positions) {
        if ( position.x() < 0 || position.y() < 0 || position.x() >= this.tiles.length || position.y() >= this.tiles.length )
            return false;
    }
    return true;
}
 
// Vytváří novou hrací desku s novými dlaždicemi z pole tiles. Všechny ostatní dlaždice zůstávají stejné
public Board withTiles(Tile... tiles) {
    
}
    
}
