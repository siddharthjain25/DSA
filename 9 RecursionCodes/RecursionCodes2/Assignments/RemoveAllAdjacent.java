package Assignments;

public class RemoveAllAdjacent {
    public static void main(String[] args) {
         //System.out.println(skip("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }

    static String removeDuplicates(String s) {
        StringBuilder temp = new StringBuilder(s);
        return checkDuplicates(temp, 0);
    }

     static String checkDuplicates(StringBuilder temp, int n){
        if(n < 0){
            n = 0;
        }

        if (n >= temp.length() - 1)
            return temp.toString();

        if(temp.charAt(n) == temp.charAt(n + 1)){
            temp.deleteCharAt(n);
            temp.deleteCharAt(n);
            checkDuplicates(temp, n - 1);
        }

        return checkDuplicates(temp, n + 1);
    }

    static String skip(String un){
        if(un.isEmpty()){
            return "";
        }

        char ch = un.charAt(0);
        String restOfString = skip(un.substring(1));

        if(!restOfString.isEmpty() && ch == restOfString.charAt(0)){
            return restOfString;
        } else {
            return ch + restOfString;
        }
    }
}
