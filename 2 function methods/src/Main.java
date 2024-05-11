import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int ans = sum2();
        System.out.println(ans);
    }

    static int sum2(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a:");
            int a = input.nextInt();
            System.out.print("Enter b:");
            int b = input.nextInt();
            return a + b;
    }
    static void sum(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a:");
            int a = input.nextInt();
            System.out.print("Enter b:");
            int b = input.nextInt();
            int ans = a + b;
            System.out.println(ans);
    }
}