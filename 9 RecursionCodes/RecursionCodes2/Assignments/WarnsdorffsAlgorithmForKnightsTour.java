package Assignments;

import java.util.Arrays;

public class WarnsdorffsAlgorithmForKnightsTour {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 1);
    }
    static void knights(boolean[][] board, int row, int col, int knights) {
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return;
        }

        if(col == board.length){
            knights(board, row + 1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knights(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }

        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }

        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }

        return true;
    }

    // Do not repeat yourself, Hence created this function.
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    static void allPathWithDemonPrint(String p, boolean[][] maze, int row, int col, int[][] path, int steps){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            path[row][col] = steps;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // I am considering this block in my path.
        maze[row][col] = false;
        path[row][col] = steps;

        if(row < maze.length - 1){
            allPathWithDemonPrint(p + 'D', maze, row + 1, col, path, steps + 1);
        }

        if(col < maze[0].length - 1){
            allPathWithDemonPrint(p + 'R', maze, row, col + 1, path, steps + 1);
        }

        if(row > 0 ){
            allPathWithDemonPrint(p + 'U', maze, row - 1, col, path, steps + 1);
        }

        if(col > 0 ){
            allPathWithDemonPrint(p + 'L', maze, row, col - 1, path, steps + 1);
        }

        // This line is where the function will be over. So before the function gets
        // removed, also remove the changes made by that function.

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
