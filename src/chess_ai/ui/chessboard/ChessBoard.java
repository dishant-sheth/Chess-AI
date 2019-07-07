/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_ai.ui.chessboard;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author dishantsheth
 */

public class ChessBoard{

    private final int rows = 8;
    private final int columns = 8;
    //The chessboard panel
    private final JPanel board;
    //Consider each of the squares to be a button.
    private final JButton[][] boxes;
    //Margin for these buttons
    private final Insets buttonMargin;
    private final String firstRow = "ABCDEFGH";
    
    public ChessBoard(){
        boxes = new JButton[rows][columns];
        buttonMargin = new Insets(0,0,0,0);        
        
        board = new JPanel(new GridLayout(0, 9));
        board.setBorder(new LineBorder(Color.BLACK));
        //Build the chessboard
        buildBoard();
    }
    
    private void buildBoard(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                JButton box = new JButton();
                box.setMargin(buttonMargin);
                box.setOpaque(true);
                box.setBorderPainted(false);
                ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                box.setIcon(icon);
                if((i%2 == 0 && j%2 == 0) || (i%2 == 1 && j%2 == 1)){
                    box.setBackground(Color.WHITE);
                }
                else{
                    box.setBackground(Color.BLACK);
                }
                boxes[i][j] = box;
            }
        }
        
        //Fill the first row
        board.add(new JLabel("", SwingConstants.CENTER));
        for(int j=0; j<columns; j++){
            board.add(new JLabel(firstRow.substring(j, j+1), SwingConstants.CENTER));
        }
        
        //Fill the remainin board
        for(int i=0; i<rows; i++){
            board.add(new JLabel(String.valueOf(i+1), SwingConstants.CENTER));
            for(int j=0; j<columns; j++){
                    board.add(boxes[i][j]);
            }
        }
    }    
    
    public JPanel returnBoard(){
        return board;
    }
}
