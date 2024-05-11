import java.util.Arrays;

public class MissingNumbers {
    public int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }

        //Search for first missing element.
        // case 1
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index)
                return index;
        }
        // case 2
        return arr.length;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

