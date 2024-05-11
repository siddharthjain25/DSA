import java.util.Arrays;
import java.util.Scanner;
// Linear Search
public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(linearSearch(arr, num));
    }
    static boolean linearSearch(int[] arr, int num){
        if(arr.length == 0){
            return false;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num) {
                System.out.println("Found in the " + j + " iteration.");
                return true;
            }
            System.out.println("Not found in the " + j + " iteration.");
        }
        return false;
    }
}