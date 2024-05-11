import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int[] arr = {4, 0, -5, 9, 9, 3, 3, 5, -4};
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}