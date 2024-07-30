package Backtracking;

public class NKings {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(kings(board, 0));
    }

    static int kings(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // Placing the king and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            // Place the King if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += kings(board, row + 1); // move to the next row
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check the cell directly above
        if (row > 0 && board[row - 1][col]) {
            return false;
        }

        // Check the cell to the left
        if (col > 0 && board[row][col - 1]) {
            return false;
        }

        // Check the cell to the right
        if (col < board.length - 1 && board[row][col + 1]) {
            return false;
        }

        // Check the top-left diagonal
        if (row > 0 && col > 0 && board[row - 1][col - 1]) {
            return false;
        }

        // Check the top-right diagonal
        if (row > 0 && col < board.length - 1 && board[row - 1][col + 1]) {
            return false;
        }

        // Check the bottom-left diagonal (this is not necessary in this context as we're filling row by row)
        if (row < board.length - 1 && col > 0 && board[row + 1][col - 1]) {
            return false;
        }

        // Check the bottom-right diagonal (this is not necessary in this context as we're filling row by row)
        if (row < board.length - 1 && col < board.length - 1 && board[row + 1][col + 1]) {
            return false;
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
