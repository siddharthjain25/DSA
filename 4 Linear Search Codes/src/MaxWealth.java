public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // Person = rol
        // Account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // When you start a new col, take a new sum of that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            // Now we have sum of accounts of person
            // Check with overall ans

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
