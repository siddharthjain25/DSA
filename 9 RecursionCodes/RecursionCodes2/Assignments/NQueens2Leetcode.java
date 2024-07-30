package Assignments;

public class NQueens2Leetcode {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalNQueens(n));
    }

    static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board, 0, n);
    }

    static int queens(boolean[][] board, int row, int queens) {
        if (queens == 0) {
            return 1;
        }

        int count = 0;

        // Placing the queen and checking for every row and column;
        for (int col = 0; col < board.length; col++) {
            // Place the Queen if it is safe.
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1, queens - 1);
                board[row][col] = false;
            }
        }
        return count;
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
