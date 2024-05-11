public class CeilingPractice {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6, 8, 9, 35, 58, 59, 80};
        int target = 60;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
                return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
