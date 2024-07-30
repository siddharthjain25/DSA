package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2191 {
    public static void main(String[] args) {
        int[] mapping = {0,1,2,3,4,5,6,7,8,9};
        int[] nums = {789,456,123};
        //System.out.println(Arrays.toString(sortJumbled(mapping, nums)));
        System.out.println(Arrays.toString(sortJumbled2(mapping, nums)));
    }
    static int[] sortJumbled(int[] mapping, int[] nums) {
        int[] temp = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            String n = Integer.toString(nums[j]);
            StringBuilder sb = new StringBuilder();
//            for (int k = 0; k < n.length(); k++) {
//                sb.append(mapping[n.charAt(k) - '0']);
//            }
            for (char ch : n.toCharArray()) {
                sb.append(mapping[ch - '0']);
            }
            temp[j] = Integer.parseInt(String.valueOf(sb));
        }

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (temp[i] > temp[i + 1]) {
                    int x = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = x;
                    int y = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = y;
                }
            }
        }

        return nums;
    }
    static int[] sortJumbled2(int[] mapping, int[] nums) {
        // Step 1: Create a list to store original nums and their mapped values
        List<int[]> mappedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            StringBuilder n = new StringBuilder();
            for (char ch : s.toCharArray()) {
                n.append(mapping[ch - '0']);
            }
            mappedList.add(new int[] { nums[i], Integer.parseInt(n.toString()), i });
        }

        // Step 2: Sort the list based on the mapped values and original indices for
        // stability
        mappedList.sort((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[2], b[2]);
            }
        });

        // Step 3: Create a result array and fill it with the sorted original nums
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < mappedList.size(); i++) {
            sortedNums[i] = mappedList.get(i)[0];
        }

        return sortedNums;
    }
}
