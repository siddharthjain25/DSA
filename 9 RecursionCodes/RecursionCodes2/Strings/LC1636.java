package Strings;

import java.util.Arrays;

public class LC1636 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    static int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    if(nums[i] == nums[i + 1]){
                        int x = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = x;
                    }
                }
            }
        }

        return nums;
    }
}
