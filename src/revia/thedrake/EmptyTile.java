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
public class EmptyTile extends Tile{
    
    public EmptyTile(TilePosition position) {
        super (position);
    }
    
    @Override
    public boolean acceptsTroop(Troop troop) {
        return true;
    }
 
    @Override
    public boolean hasTroop(){
        return false;
    }

    @Override
    public Troop troop(){
        throw new UnsupportedOperationException("Any troop on EpmtyTile.");
    }

}
