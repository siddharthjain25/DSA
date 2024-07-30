package sorting;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {
        int[] arr = {2,312,123,12,344,3,4,23,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] mixed = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mixed[k] = left[i];
                i++;
            }else{
                mixed[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mixed[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mixed[k] = right[j];
            j++;
            k++;
        }

        return mixed;
    }
}