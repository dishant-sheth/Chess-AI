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
public class Rook extends Piece{
    private Piece rook;
    
    public Rook(int color){
        rook = new Piece();
        rook.color = color;
        rook.pieceName = ((color == 0) ? "Black" : "White") + "Rook";
        rook.iconLocation = rook.baseLocation + ((color == 0) ? "BR" : "WR") + ".png";
    }
    
    public String getLocation(){
        return rook.iconLocation;
    }
}
