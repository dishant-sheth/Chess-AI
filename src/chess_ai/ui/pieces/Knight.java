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
public class Knight {
    private Piece knight;
    
    public Knight(int color){
        knight = new Piece();
        knight.color = color;
        knight.pieceName = ((color == 0) ? "Black" : "White") + "Knight";
        knight.iconLocation = knight.baseLocation + ((color == 0) ? "BN" : "WN") + ".png";
    }
    
    public String getLocation(){
        return knight.iconLocation;
    }
}
