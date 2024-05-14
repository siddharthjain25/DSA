public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for (int row = 1; row < n; row++) {
            // For every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When row is printed, we need to add a newline
            System.out.println();
        }
    }
}
