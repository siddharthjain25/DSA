public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10, -7, 30, 40, 12, 62, 84, 3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
