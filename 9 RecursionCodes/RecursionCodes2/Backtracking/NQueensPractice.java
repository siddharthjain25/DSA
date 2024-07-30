package Backtracking;

public class NQueensPractice {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        NQueens(board, 0);
    }
    static void NQueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                NQueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // Vertical Check
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // Diagonal Left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }

        // Diagonal Right;
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
