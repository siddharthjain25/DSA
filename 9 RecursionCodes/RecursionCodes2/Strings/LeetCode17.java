package Strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    public static void main(String[] args) {
        //phonepad("", "12");
        //System.out.println(phonepadList("", "12"));
        //System.out.println(phonepadListLeet("12"));
        System.out.println(letterCombinations("23"));
    }
    static void phonepad(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = un.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            phonepad(p + ch, un.substring(1));
        }
    }

    static ArrayList<String> phonepadList(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = un.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(phonepadList(p + ch, un.substring(1)));
        }

        return list;
    }
    static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return phonepadListLeet("", digits);
    }

    static ArrayList<String> phonepadListLeet(String p, String un) {
        if (un.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = un.charAt(0) - '0';
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String letters = arr[digit];
        ArrayList<String> list = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            list.addAll(phonepadListLeet(p + ch, un.substring(1)));
        }

        return list;
    }
}
