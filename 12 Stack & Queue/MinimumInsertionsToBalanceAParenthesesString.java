public class MinimumInsertionsToBalanceAParenthesesString {
    public static void main(String[] args) {
        String s = "))())(";
        System.out.println(minInsertions(s));
    }
    static int minInsertions(String s) {
        int opening = 0, closing = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                if(closing % 2 == 1) {
                    closing--;
                    opening++;
                }
                closing += 2;
            } else {
                closing--;
                if(closing < 0) {
                    opening++;
                    closing += 2;
                }
            }
        }
        return opening + closing;
    }
}
