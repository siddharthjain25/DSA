public class Main {
    public static void main(String[] args) {
        // datatype[] variable_name = new datatype[size];
        int[] rollNo = new int[5];
        int[] rollNo2 = new int[5];
        // Directly
        int[] rollNo3 = {10, 12, 52, 30};
        int[] ros; // Declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // Actually here object is being created in the heap memory.
        String[] arr = new String[5];
        System.out.println(arr[0]);

//        for (String element : arr){
//            System.out.println(element);
//        }
    }
}