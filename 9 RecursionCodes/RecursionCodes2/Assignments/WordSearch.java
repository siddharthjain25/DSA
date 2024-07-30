package Assignments;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    static boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (find(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean find(char[][] board, String word, int row, int col, int n){
        if (n == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(n)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '.';

        boolean found = find(board, word, row + 1, col, n + 1) ||
                        find(board, word, row - 1, col, n + 1) ||
                        find(board, word, row, col + 1, n + 1) ||
                        find(board, word, row, col - 1, n + 1);

        board[row][col] = temp;

        return found;
    }
}
