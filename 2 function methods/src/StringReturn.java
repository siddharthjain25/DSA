import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        String greeting = greet(name);
        System.out.println(greeting);
    }
    static String greet(String name){
        return "Hello " + name;
    }
}
