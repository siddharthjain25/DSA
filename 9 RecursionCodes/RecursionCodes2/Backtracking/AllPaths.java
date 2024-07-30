package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        //allPathWithDemon("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathWithDemonPrint("", board, 0, 0, path, 1);
    }
    static void allPathWithDemon(String p, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // I am considering this block in my path.
        maze[row][col] = false;

        if(row < maze.length - 1){
            allPathWithDemon(p + 'D', maze, row + 1, col);
        }

        if(col < maze[0].length - 1){
            allPathWithDemon(p + 'R', maze, row, col + 1);
        }

        if(row > 0 ){
            allPathWithDemon(p + 'U', maze, row - 1, col);
        }

        if(col > 0 ){
            allPathWithDemon(p + 'L', maze, row, col - 1);
        }

        // This line is where the function will be over. So before the function gets
        // removed, also remove the changes made by that function.

        maze[row][col] = true;
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
