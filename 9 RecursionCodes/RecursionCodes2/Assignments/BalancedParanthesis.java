package Assignments;

import java.util.Arrays;

public class BalancedParanthesis {
    public static void main(String[] args) {
        char[] arr = "[(])".toCharArray();
        int n = arr.length;
        System.out.println(check(arr, n));
    }
    // function to check if parenthesis are
    // balanced.
    static boolean check(char[] arr, int n) {
        // Base cases
        if (n == 0)
            return true;
        if (n == 1)
            return false;
        if (arr[0] == ')' || arr[0] == '}' || arr[0] == ']')
            return false;

        // Search for closing bracket for first
        // opening bracket.
        char closing = findClosing(arr[0]);

        // count is used to handle cases like
        // "((()))". We basically need to
        // consider matching closing bracket.
        int i, count = 0;
        for (i = 1; i < n; i++) {
            if (arr[i] == arr[0])
                count++;
            if (arr[i] == closing) {
                if (count == 0)
                    break;
                count--;
            }
        }

        // If we did not find a closing
        // bracket
        if (i == n)
            return false;

        // If closing bracket was next
        // to open
        if (i == 1)
            return check(Arrays.copyOfRange(arr, i + 1, n), n - 2);
        // If closing bracket was somewhere
        // in middle.
        // check in the middle part and check in the remaining part
        return check(Arrays.copyOfRange(arr, 1, i), i - 1) && check(Arrays.copyOfRange(arr, (i + 1), n), n - i - 1);
    }

    static char findClosing(char c) {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        if (c == '[')
            return ']';
        return Character.MIN_VALUE;
    }
}
