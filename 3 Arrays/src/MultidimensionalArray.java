import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//         int[][] arr = new int[3][];
//        int[][] arr =  {
//                {1, 2, 3}, // 0th index
//                {5, 6, 7}, // 1st index
//                {4, 8, 9} // 2nd index
//        };
//        System.out.println(Arrays.toString(arr[0]));

        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
        // Input
        for(int row = 0; row < arr.length; row++){
            // For each column in every row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

        // Output
//        for(int row = 0; row < arr.length; row++){
//            // For each column in every row
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + "  ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
