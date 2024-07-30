package Assignments;

public class CountTillZero {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }

        return num % 2 == 0 ? helper(num >> 1, count + 1) : helper(num - 1, count + 1);
    }
}
