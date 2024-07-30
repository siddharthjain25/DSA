package Assignments;

public class LC1653 {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab"));
    }
    static int minimumDeletions(String s) {
        int bCount = 0;
	    int NumberOfMinimumDeletionsRequired = 0;

	    for(int i = 0; i < s.length(); i++){
		    if(s.charAt(i) != 'b'){
                NumberOfMinimumDeletionsRequired = Math.min(1 + NumberOfMinimumDeletionsRequired, bCount);
            }
		    else{
                bCount++;
            }
	    }

	    return NumberOfMinimumDeletionsRequired;

//        int num = 0;
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < sb.length(); i++) {
//            for (int j = 0; j < i; j++) {
//                if(sb.charAt(i) == 'b' && sb.charAt(j) == 'a'){
//                    num += 1;
//                }
//            }
//        }
//
//        return num;
    }
}
