import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
//        int start = 0;
//        int sum = 0;
//        int sum1 = 0;
//        while(start < arr.length){
//            sum = arr[start];
//            sum1 += sum;
//            start++;
//        }
//        System.out.println(sum1);
        int start = 0;
        while(start < arr.length){
            System.out.print(arr[start] + " ");
            start++;
        }
    }
}
