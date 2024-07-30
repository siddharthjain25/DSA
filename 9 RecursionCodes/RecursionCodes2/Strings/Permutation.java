package Strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        //permutation("", "abc");
        System.out.println(permutationList("", "AAB"));
        //System.out.println(permutationCount("", "abc"));
//        int[] nums = {0,-1,1};
//        System.out.println(permute(nums));
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num))
                    continue; // element already exists, skip
                tempList.add(num);
                backtrack(result, tempList, nums);
                tempList.removeLast();
            }
        }
    }

    static void permutation(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String First = p.substring(0, i);
            String Second = p.substring(i, p.length());
            permutation(First + ch + Second, un.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String un) {
        if (un.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String First = p.substring(0, i);
            String Second = p.substring(i);
            ArrayList<String> partialAns = permutationList(First + ch + Second, un.substring(1));

            for (String s : partialAns) {
                if (!ans.contains(s)) {
                    ans.add(s);
                }
            }
        }

        return ans;
    }

    static int permutationCount(String p, String un){
        if(un.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = un.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String First = p.substring(0, i);
            String Second = p.substring(i, p.length());
            count = count + permutationCount(First + ch + Second, un.substring(1));
        }

        return count;
    }
}
