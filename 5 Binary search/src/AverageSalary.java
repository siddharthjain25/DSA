import java.util.Arrays;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/1175372328/

public class AverageSalary {
    public static void main(String[] args) {
        int[] arr = {8000,9000,2000,3000,6000,1000};
        double ans = salary(arr);
        System.out.println(ans);
    }
    static double salary(int[] salary){
        double num;
        double ans = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; i++) {
            num = salary[i];
            ans += num;
        }
        ans /= salary.length - 2;
        return ans;
    }
}
