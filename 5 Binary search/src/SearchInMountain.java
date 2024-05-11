public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2,1};
        int ans = mountain(arr);
        System.out.println(ans);
    }

    int Search(int[] arr, int target){
        int peak = mountain(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // Try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
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

    static int mountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+ 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
