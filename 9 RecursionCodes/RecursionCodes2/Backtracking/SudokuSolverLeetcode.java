package Backtracking;

public class SudokuSolverLeetcode {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.'},
                {'6', '.', '.', '1', '9', '5'},
                {'.', '9', '8', '.', '.', '.'},
                {'8', '.', '.', '.', '6', '.'},
                {'4', '.', '.', '8', '.', '3'},
                {'7', '.', '.', '.', '2', '.'},
        };
        if (solve2(board)) {
            display2(board);
        }
    }

    static boolean solve2(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true; // Sudoku is solved
        }

        // backtrack
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe2(board, row, col, number)) {
                board[row][col] = number; // Place the number
                if (solve2(board)) {
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '.'; // Reset the cell
                }
            }
        }
        return false;
    }

    static boolean isSafe2(char[][] board, int row, int col, char num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (char[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display2(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
