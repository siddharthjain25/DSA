import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {4, 0, -5, 9, 9, 3, 3, 5, -4};
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
