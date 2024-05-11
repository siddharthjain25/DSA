public class EvenNumbers {
    public static void main(String[] args){
        int[] arr = {3, 2, 11, 10, 78};
        int count = 0;

        for (int j : arr) {
            if (j % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
