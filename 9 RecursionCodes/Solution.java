import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    static int[] removeDuplicates(int[] nums) {
        //int count = 0;
        int[] temp = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                temp[i] = nums[i + 1];
                if(nums[i] != temp[i - 1]){
                   temp[i] = nums[i + 1];
                }
            }else{
                temp[i] = nums[i + 1];
            }
        }
        return temp;
    }
}