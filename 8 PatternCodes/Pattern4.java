public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        for (int row = 1; row < n; row++) {
            // For every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // When row is printed, we need to add a newline
            System.out.println();
        }
    }
}
