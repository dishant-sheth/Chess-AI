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
public class Bishop {
    private Piece bishop;
    
    public Bishop(int color){
        bishop = new Piece();
        bishop.color = color;
        bishop.pieceName = ((color == 0) ? "Black" : "White") + "Bishop";
        bishop.iconLocation = bishop.baseLocation + ((color == 0) ? "BB" : "WB") + ".png";
    }
    
    public String getLocation(){
        return bishop.iconLocation;
    }
}
