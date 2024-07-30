package Assignments;

import java.util.ArrayList;
import java.util.List;

public class NQueensLeetcode {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }

    static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        queens(board, 0, n, result);
        return result;
    }

    static void queens(boolean[][] board, int row, int queens, List<List<String>> result) {
        if (queens == 0) {
            List<String> list = new ArrayList<>();
            for (boolean[] k : board) {
                StringBuilder sb = new StringBuilder();
                for (boolean element : k) {
                    if (element) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            result.add(list);
            return;
        }

        // Placing the queen and checking for every row and column;
        for (int col = 0; col < board.length; col++) {
            // Place the Queen if it is safe.
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, queens - 1, result);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row;
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Diagonal Left;
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal Right;
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }
}
