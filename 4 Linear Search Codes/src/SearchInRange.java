import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = new int[5];
        int start = 0;
        int end = 2;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(linearSearch(arr, num, start, end));
    }
    static boolean linearSearch(int[] arr, int num, int start, int end){
        if(arr.length == 0){
            return false;
        }
        for (int j = start; j <= end; j++) {
            if (arr[j] == num) {
                System.out.println("Found in the " + j + " iteration.");
                return true;
            }
            System.out.println("Not found in the " + j + " iteration.");
        }
        return false;
    }
}
