import java.util.Arrays;

public class ArrayWithFunction {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
