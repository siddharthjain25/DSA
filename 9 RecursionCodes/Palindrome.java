public class Palindrome {
    public static void main(String[] args) {
        String num = "12321";
        int n = num.length();
        System.out.println(isPalindrome(num));
    }
    static Boolean isPalindrome(String num){
        if(num.isEmpty() || num.length() == 1)
            return true;

        if(num.charAt(0) == num.charAt(num.length() - 1))
            return isPalindrome(num.substring(1, num.length() - 1));

        return false;
    }
}
