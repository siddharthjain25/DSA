import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array of primitives
//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        System.out.println(arr[4]);

        //input using for loop
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }

//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        System.out.println(Arrays.toString(arr));

        //Enhanced for loop
//        for(int num: arr){ // For every element in array, print the element.
//            System.out.println(num); // Here num represents element of the array.
//        }

//        System.out.println(arr[5]); Index out of bound error

        // Array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "Pokemon";
    }
}
