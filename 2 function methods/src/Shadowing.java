public class Shadowing {
    static int x = 90; //This will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; //The class variable at line 4 is shadowed by this.
        x = 40;
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x); //90
    }
}
