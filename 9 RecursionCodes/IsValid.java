class IsValid {
    public static void main(String[] args) {
        String s = "(){}}{";
        isValid(s);
    }
    static boolean isValid(String s) {
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                return false;
            }
            else if(s.charAt(i) == '('){
                return s.charAt(i + 1) == ')';
            }
            else if(s.charAt(i) == '{'){
                return s.charAt(i + 1) == '}';
            }
            else if(s.charAt(i) == '['){
                return s.charAt(i + 1) == ']';
            }else{
                return false;
            }
        }
        return false;
    }
}