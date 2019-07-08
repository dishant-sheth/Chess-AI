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
public class Queen {
    private Piece queen;
    
    public Queen(int color){
        queen = new Piece();
        queen.color = color;
        queen.pieceName = ((color == 0) ? "Black" : "White") + "Rook";
        queen.iconLocation = queen.baseLocation + ((color == 0) ? "BQ" : "WQ") + ".png";
    }
    
    public String getLocation(){
        return queen.iconLocation;
    }
}
