import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 90);
        list.remove(2);
        System.out.println(list);
        
        // Input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // Get item at any index.
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // Pass index here, list[index] syntax will not work here.
        }

        System.out.println(list);
    }
}
