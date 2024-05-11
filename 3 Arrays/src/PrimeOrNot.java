import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 1){
            System.out.println("Number is not prime neither composite.");
            System. exit(0);
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                System.out.println("Not a prime number.");
                System. exit(0);
            }
            c += 1;
        }
        System.out.println("Prime Number");
    }
}
