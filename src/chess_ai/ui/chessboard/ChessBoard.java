/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_ai.ui.chessboard;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import chess_ai.ui.pieces.Pawn;
import chess_ai.ui.pieces.Rook;
import chess_ai.ui.pieces.Knight;
import chess_ai.ui.pieces.Bishop;
import chess_ai.ui.pieces.King;
import chess_ai.ui.pieces.Queen;

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
                if((i%2 == 0 && j%2 == 0) || (i%2 == 1 && j%2 == 1)){
                    box.setBackground(Color.WHITE);
                }
                else{
                    box.setBackground(Color.GRAY);
                }
                boxes[i][j] = box;
            }
        }
        
        //Fill in the pieces icons
        setPieceIcons();
        
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

    private void setPieceIcons(){
        //First row
        Rook blackRook = new Rook(0);
        Knight blackKnight = new Knight(0);
        Bishop blackBishop = new Bishop(0);
        King blackKing = new King(0);
        Queen blackQueen = new Queen(0);
        
        for(int j=0; j<columns; j++){
            switch (j) {
                case 0:
                case columns-1:
                    boxes[0][j].setIcon(new ImageIcon(blackRook.getLocation()));
                    break;
                case 1:
                case columns-2:
                    boxes[0][j].setIcon(new ImageIcon(blackKnight.getLocation()));
                    break;
                case 2:
                case columns-3:
                    boxes[0][j].setIcon(new ImageIcon(blackBishop.getLocation()));
                    break;
                case 3:
                    boxes[0][j].setIcon(new ImageIcon(blackQueen.getLocation()));
                    break;
                case 4:
                    boxes[0][j].setIcon(new ImageIcon(blackKing.getLocation()));
                    break;
                default:
                    break;
            }
        }
        
        //Second row
        Pawn blackPawn = new Pawn(0); //BLACK PAWNS
        for(int j=0; j<columns; j++){
            boxes[1][j].setIcon(new ImageIcon(blackPawn.getLocation()));
        }
        
        //Second last row
        Pawn whitePawn = new Pawn(1); //WHITE PAWNS
        for(int j=0; j<columns; j++){
            boxes[6][j].setIcon(new ImageIcon(whitePawn.getLocation()));
        }
        
        //Last Row
        Rook whiteRook = new Rook(1);
        Knight whiteKnight = new Knight(1);
        Bishop whiteBishop = new Bishop(1);
        King whiteKing = new King(1);
        Queen whiteQueen = new Queen(1);
        
        for(int j=0; j<columns; j++){
            switch (j) {
                case 0:
                case columns-1:
                    boxes[rows-1][j].setIcon(new ImageIcon(whiteRook.getLocation()));
                    break;
                case 1:
                case columns-2:
                    boxes[rows-1][j].setIcon(new ImageIcon(whiteKnight.getLocation()));
                    break;
                case 2:
                case columns-3:
                    boxes[rows-1][j].setIcon(new ImageIcon(whiteBishop.getLocation()));
                    break;
                case 3:
                    boxes[rows-1][j].setIcon(new ImageIcon(whiteQueen.getLocation()));
                    break;
                case 4:
                    boxes[rows-1][j].setIcon(new ImageIcon(whiteKing.getLocation()));
                    break;
                default:
                    break;
            }
        }
    }
    
    public JPanel returnBoard(){
        return board;
    }
}
