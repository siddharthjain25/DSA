public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(38, 0));
    }
    static int sumOfDigits(int n, int newNum){

        int num = n / 10 + n % 10;
        if(newNum < 10){
            return newNum;
        }
        return sumOfDigits(num, newNum);
    }
}
