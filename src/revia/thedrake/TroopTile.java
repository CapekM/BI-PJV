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
public class TroopTile extends Tile{
    private final Troop troop;
    public TroopTile(TilePosition position, Troop troop) {
        super (position);
        this . troop = troop;
    }
    
    @Override
    public boolean acceptsTroop(Troop troop) {
        return false;
    }
 
    @Override
    public boolean hasTroop(){
        return true;
    }

    @Override
    public Troop troop(){
        return troop;
    }

    
}
