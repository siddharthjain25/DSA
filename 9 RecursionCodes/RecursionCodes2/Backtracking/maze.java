package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(pathList("", 3, 3));
//        System.out.println(pathListWithDiagonal("", 3, 3));
//        boolean[][] board = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
//        pathWithDemon("", board, 0, 0);
    }
    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }
    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            path(p + 'D', row - 1, col);
        }

        if(col > 1){
            path(p + 'R', row, col - 1);
        }
    }

    static ArrayList<String> pathList(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1){
            ans.addAll(pathList(p + 'D', row - 1, col));
        }

        if(col > 1){
            ans.addAll(pathList(p + 'R', row, col - 1));
        }

        return ans;
    }

    static ArrayList<String> pathListWithDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1 && col > 1){
            ans.addAll(pathListWithDiagonal(p + 'D', row - 1, col - 1));
        }

        if(row > 1){
            ans.addAll(pathListWithDiagonal(p + 'V', row - 1, col));
        }

        if(col > 1){
            ans.addAll(pathListWithDiagonal(p + 'H', row, col - 1));
        }

        return ans;
    }

    static void pathWithDemon(String p, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            pathWithDemon(p + 'D', maze, row + 1, col);
        }

        if(col < maze[0].length - 1){
            pathWithDemon(p + 'R', maze, row, col + 1);
        }
    }
}
