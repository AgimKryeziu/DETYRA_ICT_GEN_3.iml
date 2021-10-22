package com.company.Basic;

import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '-';
            }
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("Le te luajme Tic Tac Toe!");
        System.out.print("Lojtari i pare, si quheni: ");
        String emri1 = reader.nextLine();
        System.out.print("Lojtari i dyte, si quheni: ");
        String emri2 = reader.nextLine();
        boolean lojtari1 = true;
        boolean lojaMbaroi = false;
        while (!lojaMbaroi) {
            drawBoard(board);
            if (lojtari1) {
                System.out.print(emri1 + " rradha e juaj (x): ");
            } else {
                System.out.print(emri2 + " rradha e juaj (o): ");
            }
            char c = '-';
            if (lojtari1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int row;
            int col;
            while (true) {
                System.out.print("Shto nje numer ne rresht (0, 1 or 2): ");
                row = reader.nextInt();
                System.out.print("Shto nje numer ne colone (0, 1 or 2): ");
                col = reader.nextInt();
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Ky pozicion eshte jashte kufijve te tabeles! Provo perseri.");
                } else if (board[row][col] != '-') {
                    System.out.println("Dikush tashme ka bere nje levizje ne kete pozicion! Provo perseri");
                } else {
                    break;
                }
            }
            board[row][col] = c;
            if (playerHasWon(board) == 'x') {
                System.out.print(emri1 + " ka fituar!");
                lojaMbaroi = true;
            } else if (playerHasWon(board) == 'o') {
                System.out.println(emri2 + " ka fituar!");
                lojaMbaroi = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("Eshte barazim!");
                    lojaMbaroi = true;
                } else {
                    lojtari1 = !lojtari1;
                }
            }
            drawBoard(board);
        }
    }

    public static void drawBoard(char[][] board) {
        System.out.println("Board: ");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static char playerHasWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                return board[i][0];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                return board[0][j];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }
        return ' ';
    }

    public static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}