public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }

        //Search for first missing element.
        // case 1
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1)
                return index + 1;
        }
        // case 2
        return nums.length + 1;
    }

    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
