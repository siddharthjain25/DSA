public class Floor {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6, 8, 9, 35, 58, 59, 80};
        int target = 10;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

//            if(target == arr[mid]){
//                return arr[mid];
//            }

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
