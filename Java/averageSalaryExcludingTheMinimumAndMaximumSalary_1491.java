import java.util.Arrays;

public class averageSalaryExcludingTheMinimumAndMaximumSalary_1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double totalSum = 0;
        int divisor = n - 2;

        for (int i = 1; i < n - 1; i++ ) {
            totalSum += salary[i];
        }
        
        return totalSum / divisor;
        
    }

}
