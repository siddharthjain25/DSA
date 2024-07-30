package Strings;

public class Kpangram {
    public static void main(String[] args) {
        System.out.println(KPangram("hello world atlas we meet yet again", 11));
    }
    static boolean KPangram(String str, int k) {
        boolean[] present = new boolean[26];
        int uniqueCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                if (!present[index]) {
                    present[index] = true;
                    uniqueCount++;
                }
            }
        }

        int missingLetters = 26 - uniqueCount;
        return missingLetters <= k;
    }
}
