public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9, 35, 58, 59, 80};
        int target = 80;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // Return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; //Might be possible that (start + end) exceeds the range in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}