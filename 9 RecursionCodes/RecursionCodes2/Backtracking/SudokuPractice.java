package Backtracking;

public class SudokuPractice {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve2(board)){
            display2(board);
        }else{
            System.out.println("Cannot solve");
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = 0;
        int col = 0;

        boolean anyEmpty = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    anyEmpty = true;
                    break;
                }
            }
            if(anyEmpty){
                break;
            }
        }

        if(!anyEmpty){
            //Sudoku is solved.
            return true;
        }

        // Backtracking;
        for (int i = 1; i <= 9; i++) {
            if(checkRowColMatrix(board, row, col, i)){
                board[row][col] = i;
                if(solve(board)){
                    return true;
                }
                else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    static boolean checkRowColMatrix(int[][] board, int row, int col, int num){
        // Check for the row;
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        // Check for the col;
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == num){
                return false;
            }
        }

        // Check for the matrix according to the size of the board;
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board){
        for (int[] row : board){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
















    static boolean solve2(int[][] board){
        int n = board.length;
        int row = 0;
        int col = 0;

        boolean isEmpty = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = true;
                    break;
                }
            }
            if(!isEmpty){
                break;
            }
        }

        if(!isEmpty){
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if(checkRowColMatrix2(board, row, col, i)){
                board[row][col] = i;
                if(solve2(board)){
                    return true;
                }else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    static boolean checkRowColMatrix2(int[][] board, int row, int col, int num){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }

    static void display2(int[][] board){
        for (int[] row : board){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
