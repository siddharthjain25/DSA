import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 9, 4, 112};
        //System.out.println(find(arr, 118, 0));
        //System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // This will contains answer for that function call only.
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(answerFromBelowCalls);
        return list;
    }
}
