public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            int numberOfSpaces = n - totalColumnsInRow;
            for (int spaces = 0; spaces < numberOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
