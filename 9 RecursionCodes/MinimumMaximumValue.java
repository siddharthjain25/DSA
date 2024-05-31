public class MinimumMaximumValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        System.out.println(Min(arr, arr.length));
        System.out.println(Max(arr, arr.length));
    }

    static int Min(int[] arr, int n) {
        if(n == 1)
            return arr[0];

        return Math.min(arr[n - 1], Min(arr,n - 1));
    }

    static int Max(int[] arr, int n) {
        if(n == 1)
            return arr[0];

        return Math.max(arr[n - 1], Max(arr,n - 1));
    }
}