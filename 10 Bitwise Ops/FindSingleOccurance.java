public class FindSingleOccurance {
    public static void main(String[] args) {
        int[] arr = {2,2,6,2,7,7,8,7,8,8};
        System.out.println(findSingleNumber(arr));
    }

    static int findSingleNumber(int[] arr) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : arr) {
                sum += (num >> i) & 1;
            }

            sum %= 3;

            result |= (sum << i);
        }

        return result;
    }
}