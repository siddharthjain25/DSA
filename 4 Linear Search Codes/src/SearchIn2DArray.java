import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 8, 62},
                {65, 85, 83},
                {298, 5, 41231, 9, 1},
                {7 , 62, 81, 8, 45, -94, 8}
        };
        int target = 94;
        int[] ans = search(arr, target);// Format of the return value {row, col}
//        System.out.println(Arrays.toString(ans));
//        System.out.println(searchMaximumIn2DArray(arr, target));
        System.out.println(searchMinimumIn2DArray(arr, target));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int searchMaximumIn2DArray(int[][] arr, int target){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int searchMinimumIn2DArray(int[][] arr, int target){
        int mix = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < mix) {
                    mix = anInt;
                }
            }
        }
        return mix;
    }

    //Above codes old for
//    static int searchMaximumIn2DArray(int[][] arr, int target){
//        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] > max){
//                    max = arr[row][col];
//                }
//            }
//        }
//        return max;
//    }
}
