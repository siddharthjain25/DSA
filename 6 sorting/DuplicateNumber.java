import java.util.ArrayList;
import java.util.List;

class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,4,2,3,1,3,4};
        dn(nums);
    }

    static void dn(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }

        // Missing Numbers OR Disappeared Numbers
        int ans = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans = nums[index];
            }
        }
        System.out.println(ans);
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}