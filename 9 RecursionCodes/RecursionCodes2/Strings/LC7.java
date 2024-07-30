package Strings;

public class LC7 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    static int reverse(int x) {
        long reversed = 0;  // Use long to detect overflow

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;

            // If reversed is out of the 32-bit signed integer range, return 0
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) reversed;
    }
}
