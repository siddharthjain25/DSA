public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 78;
            // values initialized in this block, will remain in this block
        }
        System.out.println(a);

        // Scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 10;
        }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
