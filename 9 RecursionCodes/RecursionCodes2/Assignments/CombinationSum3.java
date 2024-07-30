package Assignments;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        int target = 7;
        int k = 3;
        System.out.println(combinationSum3(target, k));
    }
    static List<List<Integer>> combinationSum3(int target, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), target, 1, k);
        return list;
    }

    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int remaining, int start, int k) {
        if (tempList.size() > k)
            return;
        if (remaining == 0 && tempList.size() == k) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            backtrack(list, tempList, remaining - i, i + 1, k);
            tempList.removeLast();
        }
    }

//    static List<List<Integer>> combinationSum3(int[] candidates, int target, int k) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(candidates);
//        backtrack(list, new ArrayList<>(), candidates, target, 0, k);
//        return list;
//    }
//
//    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remaining, int start, int k) {
//        if (remaining < 0)
//            return;
//        else if (remaining == 0)
//            list.add(new ArrayList<>(tempList));
//        else {
//            for (int i = start; i < candidates.length; i++) {
//                if(i > start && candidates[i] == candidates[i - 1])
//                    continue;
//                tempList.add(candidates[i]);
//                if(tempList.toArray().length != k){
//                    for (int j = 0; j < tempList.toArray().length - 1; j++) {
//                        tempList.remove(j);
//                    }
//                }
//                backtrack(list, tempList, candidates, remaining - candidates[i], i + 1, k);
//                tempList.removeLast();
//            }
//        }
//    }
}
