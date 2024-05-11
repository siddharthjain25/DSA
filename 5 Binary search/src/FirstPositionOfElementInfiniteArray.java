public class FirstPositionOfElementInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingRange(arr, target));
    }
    static int findingRange(int[] arr, int target){
        // First find the range
        // First start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1;
            // Double the box value
            // end = previous end + sizeOfBox * 2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; //Might be possible that (start + end) exceeds the range in java
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
