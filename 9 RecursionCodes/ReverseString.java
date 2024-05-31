import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
    static void reverseString(char[] s){
        int n = s.length;
        if(n == 1)
            System.out.println(s[0]);

        for (int i = 0; i <= n; i++) {
            char temp = s[i];
            s[i] = s[--n];
            s[n] = temp;
        }

        System.out.println(s);
    }
}
