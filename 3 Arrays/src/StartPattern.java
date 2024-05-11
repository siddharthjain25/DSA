public class StartPattern {
    public static void main(String[] args){
        // Triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
