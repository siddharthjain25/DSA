import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRepeatConcat {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayList<Integer> repeated = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int k : arr) {
                repeated.add(k);
            }
        }
        int[] ans = new int[repeated.size()];
        for (int i = 0; i < repeated.size(); i++) {
            ans[i] = repeated.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
