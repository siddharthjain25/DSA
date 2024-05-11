public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        int temp = 1;
//        for (int i = 1; i == 1; i++) {
//            int ans = num / 2;
//            if(ans % 2 == temp){
//                System.out.println(true);
//                System.exit(0);
//            }
//            i--;
//            num = ans;
//        }
        while(temp == 1){
            int ans = num / 2;
            temp = ans % 2;
            if(temp == 1){
                System.out.println(true);
                System.exit(0);
            }
            num = ans;
        }
    }
}