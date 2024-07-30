import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        //print(4, 0);
        //print1(4, 0);
        int[] arr = {5, 1, 6, 3, 2};
        //bubble(arr, arr.length - 1, 0);
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void print(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            print(row, col + 1);
        }else {
            System.out.println();
            print(row - 1, 0);
        }
    }

    static void print1(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            print1(row, col + 1);
            System.out.print("*");
        }else {
            print1(row - 1, 0);
            System.out.println();
        }
    }

    static void bubble(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row,col + 1);
        }
        else {
            bubble(arr,row - 1,0);
        }
    }

    static void selection(int[] arr, int row, int col, int max){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[max]){
                selection(arr, row, col + 1, col);
            }else {
                selection(arr, row, col + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            bubble(arr,row - 1,0);
        }
    }
}
