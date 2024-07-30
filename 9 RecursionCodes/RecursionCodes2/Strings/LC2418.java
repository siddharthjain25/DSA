package Strings;

import java.util.Arrays;

public class LC2418 {
    public static void main(String[] args) {
        String[] students = {"Alice","Bob","Pikachu", "name1", "name4", "name5", "name12", "name3", "name0"};
        int[] heights = {2,312,123,12,344,3,4,23,1};
        System.out.println(Arrays.toString(sortPeople(students, heights)));
    }
    static String[] sortPeople(String[] names, int[] heights) {
        for (int j = 0; j < heights.length; j++) {
            for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] < heights[i + 1]) {
                    int x = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = x;
                    String y = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = y;
                }
            }
        }

        return names;
    }
}
