package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {1,2,3};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remaining, int start) {
        if (remaining < 0) return;
        else if (remaining == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remaining - candidates[i], i);
                tempList.removeLast();
            }
        }
    }
}