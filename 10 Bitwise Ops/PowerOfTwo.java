public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 20; // if n == 0 then return false;
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
