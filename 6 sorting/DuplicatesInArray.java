import java.util.ArrayList;
import java.util.List;

class DuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicatesInArray(nums);
    }

    static List<Integer> findDuplicatesInArray(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        System.out.println(ans);
        return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}