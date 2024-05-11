import java.util.Arrays;

public class BubblePractice {
    public static void main(String[] args){
        int[] arr = {5, 9, 2, 1, 0, 8, 9, 6, 3, 4, -8, -6};
        for (int i = 0; i < arr.length; i++){
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
