/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revia.thedrake;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 *
 * @author Martin
 */
public class ReviaThedrake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Board board = new Board(5);
		assertEquals(5, board.dimension());
		
		for(int row = 1; row <= 5; row++) {
			for(char col = 'a'; col <= 'e'; col++) {
				TilePosition pos = new TilePosition(col, row);
				assertTrue(board.contains(pos));
				assertTrue(board.tileAt(pos) instanceof EmptyTile);
			}
		}
		board.contains(new TilePosition("a0"));
		assertFalse(board.contains(new TilePosition("a0")));
		assertFalse(board.contains(new TilePosition("a6")));
		assertFalse(board.contains(new TilePosition("f1")));
		assertFalse(board.contains(new TilePosition("f5")));
		assertFalse(board.contains(new TilePosition("e0")));
		assertFalse(board.contains(new TilePosition("e6")));
                
        	TroopInfo drakeInfo = new TroopInfo("Drake");
		Troop drake1 = new Troop(drakeInfo, PlayingSide.BLUE, TroopFace.FRONT);
		Troop drake2 = new Troop(drakeInfo, PlayingSide.ORANGE, TroopFace.FRONT);
        //my little test
//        TroopInfo info = new TroopInfo("Archer", new Offset2D(1, 1), new Offset2D(0, 1));
//        Troop troop = new Troop(info, PlayingSide.BLUE, TroopFace.BACK);
//        
//        TilePosition c3 = new TilePosition("c3");
//	Tile troopTile = new TroopTile(c3, troop);
//        TilePosition a3 = new TilePosition("a3");
//	Tile troopTile2 = new TroopTile(a3, troop);
//        
//        
//        Board board = new Board(5, troopTile, troopTile2);
//        System.out.println(board.dimension());

    }
    
}
