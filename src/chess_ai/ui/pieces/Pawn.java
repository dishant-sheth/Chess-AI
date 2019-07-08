/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_ai.ui.pieces;

/**
 *
 * @author dishantsheth
 */
public class Pawn extends Piece{
    
    private Piece pawn;
    
    public Pawn(int color){
        pawn = new Piece();
        pawn.color = color;
        pawn.pieceName = ((color == 0) ? "Black" : "White") + "Pawn";
        pawn.iconLocation = pawn.baseLocation + ((color == 0) ? "BP" : "WP") + ".png";
    }
    
    public String getLocation(){
        return pawn.iconLocation;
    }
}
