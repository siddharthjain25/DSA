import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };
        int target = 520;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    //Search in the row provided between the column provided.
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if(target == matrix[row][mid]){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target){
                colStart = mid + 1;
            }else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;// Be aware, matrix could be empty.

        if(row == 1){
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;
        // Run the loop till 2 rows are remaining.
        while(rowStart < (rowEnd - 1)){// While this is true it wall have more than 2 rows.
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[mid][colMid] == target){
                return new int[]{mid, colMid};
            }

            if(matrix[mid][colMid] < target){
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }
        // Now we have two rows.
        // Check weather the target is in the col of 2 rows.
        if(matrix[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }

        if(matrix[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

        // Search in 1st half.
        if(target <= matrix[rowStart][colMid - 1]){
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // Search in 2nd half.
        if(target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]){
            return binarySearch(matrix, rowStart, colMid + 1, colMid - 1, target);
        }
        // Search in 3rd half.
        if(target <= matrix[rowStart + 1][colMid - 1]){
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }
        // Search in 4th half.
        else{
            return binarySearch(matrix, rowStart + 1, colMid + 1, col - 1, target);
        }
    }
}
