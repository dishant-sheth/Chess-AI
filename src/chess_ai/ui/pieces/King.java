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
public class King {
    private Piece king;
    
    public King(int color){
        king = new Piece();
        king.color = color;
        king.pieceName = ((color == 0) ? "Black" : "White") + "King";
        king.iconLocation = king.baseLocation + ((color == 0) ? "BK" : "WK") + ".png";
    }
    
    public String getLocation(){
        return king.iconLocation;
    }
}
