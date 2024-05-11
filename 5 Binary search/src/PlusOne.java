import java.util.Arrays;

// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4, 9, 9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
