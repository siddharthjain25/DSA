class Mismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        mismatchNum(nums);
    }

    static int[] mismatchNum(int[] nums) {
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
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1 , -1};
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}