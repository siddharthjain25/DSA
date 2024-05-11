// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 6, 1, 7, 2, 8};
        int n = 10;
        int sum = (n * (n + 1)) / 2;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            temp += array[i];
        }

        int missingNum = sum - temp;
        System.out.println(missingNum);
    }
}

