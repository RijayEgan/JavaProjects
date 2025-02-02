import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },  
        };

        board = getSudoku(board);

        boolean solve = solver(board);
        if(solve) {
            display(board);
        }
        else {
            JOptionPane.showMessageDialog(null,"Not solvable.");
        }
    }

    //Backtracking-Algorithm
    public static boolean solver(int[][] board) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == 0) {

                    for (int n = 1; n < 10; n++) {

                        if (checkRow(board, i, n) && checkColumn(board, j, n) && checkBox(board, i, j, n)) {

                            board[i][j] = n;
                            if (!solver(board)) {

                                board[i][j] = 0;
                            }
                            else {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkRow(int[][] board, int row, int n) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == n) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] board, int column, int n) {
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == n) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkBox(int[][] board, int row, int column, int n) {
        row = row - row % 3;
        column = column - column % 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }

        }
        return true;
    }
    public static int[][] getSudoku(int[][] board) {

        JFrame frame = new JFrame();
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JPanel subpanel1 = new JPanel();
        subpanel1.setPreferredSize(new Dimension(500,500));
        subpanel1.setLayout( new java.awt.GridLayout( 9, 9, 20, 20 ) );
        JTextArea[][] text = new JTextArea[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                text[i][j] = new JTextArea();
                text[i][j].setText("0");
                text[i][j].setEditable(true);
                Font font = new Font("Verdana", Font.BOLD, 40);
                text[i][j].setFont(font);

                subpanel1.add(text[i][j]);
            }
        }
        JPanel subpanel2 = new JPanel();
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(int i = 0; i < 9; i++) {
                    for(int j = 0; j < 9; j++) {
                        String s = text[i][j].getText();
                        board[i][j] = Integer.valueOf(s);
                        helper(1);
                    }
                }

            }
        });

        subpanel2.add(button);
        panel.add(subpanel1, BorderLayout.WEST);
        panel.add(subpanel2, BorderLayout.EAST);
        frame.add(panel);
        frame.setVisible(true);

        while(helper(0)) {

        }
        frame.dispose();
        return board;

    }

    public static void display(int[][] board) {
        JFrame frame = new JFrame();
        frame.setSize(700,700);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout (9,9, 3 ,3));
        JTextArea[][] text = new JTextArea[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                text[i][j] = new JTextArea();
                text[i][j].setText("" + board[i][j]);
                text[i][j].setEditable(false);
                Font font = new Font("Verdana", Font.BOLD, 40);
                text[i][j].setFont(font);

                panel.add(text[i][j]);
            }
        }
        frame.add(panel);
        frame.setVisible(true);

    }
    private static boolean test = true;
    public static boolean helper(int x) {
        if(x == 1) {
            test = false;
        }
        System.out.print("");
        return test;
    }

}