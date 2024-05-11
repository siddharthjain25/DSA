// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,44,84,84};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(-681));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check weather a number contains even number of digits or not.
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}