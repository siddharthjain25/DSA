package Assignments;

import java.util.ArrayList;

public class LetterTilePossible {
    public static void main(String[] args) {
        System.out.println(subseqList("", "AAB"));
    }
    static ArrayList<String> subseqList(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);
        ArrayList<String> left = subseqList(p + ch, un.substring(1));
        ArrayList<String> right = subseqList(p, un.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> permutationList(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String First = p.substring(0, i);
            String Second = p.substring(i, p.length());
            ans.addAll(permutationList(First + ch + Second, un.substring(1)));
        }

        return ans;
    }
}
