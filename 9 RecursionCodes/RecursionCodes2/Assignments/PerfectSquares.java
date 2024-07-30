package Assignments;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(55));
    }
    public static int minLen;
    static int numSquares(int n) {
        minLen = n;
        if (Math.sqrt(n) == (int) Math.sqrt(n)) return 1;
        backtrack(0, n);
        return minLen;
    }
    static void backtrack(int length, int remain) {
        if (remain == 0) {
            minLen = Math.min(length, minLen);
        } else if (remain > 0) {
            for (int i = ((int) Math.sqrt(remain)); i >= 1; i--) {
                backtrack(length+1, remain-i*i);
            }
        }
    }
//    static int numSquares(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//
//        int ans = n;
//        for (int i = 1; i * i <= n; i++) {
//            ans = Math.min(ans, 1 + numSquares(n - i * i));
//        }
//
//        return ans;
//    }
//    static int numSquares(int n){
//        int[] dp = new int[n+1];
//
//        for(int i=1; i<=n; i++){
//            dp[i] = i;
//            for(int j=1; j*j<=i; j++){
//                int square = j*j;
//                dp[i] = Math.min(dp[i], 1+dp[i - square]);
//            }
//        }
//
//        return dp[n];
//    }
}
