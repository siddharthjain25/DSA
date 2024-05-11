import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 51, 80};
        int x = 128;
        if (x < 0) {
            System.out.println(false);
            System.exit(0);
        }
        // Store the number in a variable
        int number = x;
        // This will store the reverse of the number
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        if(x == reverse){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

//        swap(arr, 0, 3);
//        reverseArray(arr);
        int start = 0;
        int end = arr.length - 1;
        int orignalArray = 0;
        int temp1 = 0;
        int reversedArray = 0;
        int temp2;
        for (int i = 0; i < arr.length; i++) {
            orignalArray = arr[i];
            temp1 = orignalArray;
            System.out.print(temp1+"");
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }



//        if(newNum == )
//        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
