// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountain {
    public static void main(String[] args){
        int[] arr = {2,1};
        int ans = mountain(arr);
        System.out.println(ans);
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
