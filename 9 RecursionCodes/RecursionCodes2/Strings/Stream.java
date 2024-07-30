package Strings;

public class Stream {
    public static void main(String[] args) {
        //skip("", "bacca");
        System.out.println(skip("bacca"));
        //System.out.println(skipString("This is the code. I will write apple app appl apple lsdapp applg"));
        //System.out.println(skipStringOnlyWithApp("This is the code. I will write apple app appl apple lsdapp applg"));
    }
    static void skip(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);
        if(ch == 'a'){
            skip(p, un.substring(1));
        }else {
            skip(p + ch, un.substring(1));
        }
    }

    static String skip(String un){
        if(un.isEmpty()){
            return "";
        }
        char ch = un.charAt(0);
        if(ch == 'a'){
            return skip(un.substring(1));
        }else {
            return ch + skip(un.substring(1));
        }
    }

    static String skipString(String un){
        if(un.isEmpty()){
            return "";
        }

        if(un.startsWith("code")){
            return skipString(un.substring(4));
        }else {
            return un.charAt(0) + skipString(un.substring(1));
        }
    }

    static String skipStringOnlyWithApp(String un){
        if(un.isEmpty()){
            return "";
        }

        if(un.startsWith("app") && !un.startsWith("apple")){
            return skipStringOnlyWithApp(un.substring(3));
        }else {
            return un.charAt(0) + skipStringOnlyWithApp(un.substring(1));
        }
    }
}
