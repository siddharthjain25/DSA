package Assignments;

public class RemoveConsecutive {
    public static void main(String[] args) {
         System.out.println(skip("geeksforgeeks"));
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
