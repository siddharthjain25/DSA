package Strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        //subset("", "AAB");
        System.out.println(subsetList("", "AAB"));
        //subsetAscii("", "AAB");
    }
    static void subset(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);

        subset(p + ch, un.substring(1));
        subset(p, un.substring(1));
    }

    static ArrayList<String> subsetList(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);
        ArrayList<String> left = subsetList(p + ch, un.substring(1));
        ArrayList<String> right = subsetList(p, un.substring(1));
        left.addAll(right);
        return left;
    }

    static void subsetAscii(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);

        subsetAscii(p + ch, un.substring(1));
        subsetAscii(p, un.substring(1));
        subsetAscii(p + (ch + 0), un.substring(1));
    }
}
