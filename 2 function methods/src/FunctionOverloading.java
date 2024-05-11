public class FunctionOverloading {
    public static void main(String[] args) {
//        fun(60);
//        fun("Siddharth");
        int ans = sum(40, 50, 60);
        int ans1 = sum(40, 50);
        System.out.println(ans + " " + ans1);
    }

    static int sum(int a, int b)
    {
        return a + b;
    }

    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
