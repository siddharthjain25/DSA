public class Max {
    public static void main(String[] args) {
        int[] arr = {100, 352, 63, 55};
        System.out.println(max(arr, 0, 2));
    }
    static int max(int[] arr, int start, int end){
        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
