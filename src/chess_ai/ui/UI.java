/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_ai.ui;

import chess_ai.ui.chessboard.ChessBoard;
import javax.swing.JFrame;

/**
 *
 * @author dishantsheth
 */
public class UI {
    
    public JFrame createFrame(){
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 800, 800);
        frame.setTitle("Chess");
        ChessBoard chessBoard = new ChessBoard();
        frame.add(chessBoard.returnBoard());
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
    
}
