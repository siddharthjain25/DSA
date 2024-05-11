public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 6, 8, 9, 35, 58, 59, 80};
        int[] arr = {80, 59, 58, 35, 6, 3, 2, 1};
        int target = 6;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // Find weather the arr is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];

//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; //Might be possible that (start + end) exceeds the range in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
