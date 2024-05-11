import java.util.ArrayList;

public class DublicateChecker{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6};
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int j : arr) {
            if (numbers.contains(j)) {
                System.out.println(true);
                System.exit(0);
            }
            numbers.add(j);
        }
        System.out.println(false);
    }
}