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
public class Piece {
    //COLOR -> 0 - BLACK | 1 - WHITE
    protected int color;
    protected String pieceName;
    protected String iconLocation;
    protected String baseLocation = "/Users/dishantsheth/Desktop/Chess-AI/src/chess_ai/ui/pieces/assets/";
    
    public Piece(){
        
    }
    
    public Piece(int color, String pieceName, String iconLocation){
        this.color = color;
        this.pieceName = pieceName;
        this.iconLocation = iconLocation;
    }
    
}
