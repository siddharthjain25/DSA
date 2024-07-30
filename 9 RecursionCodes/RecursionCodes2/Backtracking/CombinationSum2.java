package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {1,2,3};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remaining, int start) {
        if (remaining < 0)
            return;
        else if (remaining == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                if(i > start && candidates[i] == candidates[i-1])
                    continue;
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remaining - candidates[i], i + 1);
                tempList.removeLast();
            }
        }
    }
}
