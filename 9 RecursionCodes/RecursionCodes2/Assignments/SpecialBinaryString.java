package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecialBinaryString {
    public static void main(String[] args) {
        System.out.println(makeLargestSpecial("11011000"));
    }

    static String makeLargestSpecialHelper(String s, int left, int right) {
    if (left >= right) {
        return "";
    }

    StringBuilder result = new StringBuilder();
    int balance = 0;
    int lastLeft = left;

    for (int i = left; i < right; i++) {
        if (s.charAt(i) == '1') {
            balance++;
        } else {
            balance--;
        }

        if (balance == 0) {
            result.append('1')
                  .append(makeLargestSpecialHelper(s, lastLeft + 1, i))
                  .append('0');
            lastLeft = i + 1;
        }
    }

    return sortSpecial(result.toString());
}

static String sortSpecial(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    reverse(chars);
    return new String(chars);
}

static void reverse(char[] array) {
    int left = 0, right = array.length - 1;
    while (left < right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++;
        right--;
    }
}

    static String makeLargestSpecial(String s) {
        int balance = 0;
        int left = 0;
        List<String> list = new ArrayList<>();
        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '0'){
                balance--;
            } else{
                balance++;
            }

            if(balance == 0){
                list.add("1" + makeLargestSpecial(s.substring(left + 1, right)) + "0");
                left = right + 1;
            }
        }
        list.sort(Collections.reverseOrder());

        return String.join("", list);

//        char[] list = s.toCharArray();
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] == '1'){
//                str.append(list[i]);
//            }
//            int numberOfOnes = str.length();
//            if(list[i] == '0'){
//                for (int j = 1; j <= numberOfOnes; j++) {
//                    if(list[i] == '1'){
//                        str.deleteCharAt(j);
//                        break;
//                    }
//                    str.append(list[i]);
//                    i++;
//                }
//            }
//        }
//
//        return str.toString();
    }
}
