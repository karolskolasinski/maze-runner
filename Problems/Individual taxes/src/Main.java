import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] incomes = new double[n];
        double[] taxes = new double[n];

        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextDouble();
        }

        double max = 0;
        int companyNo = 0;

        for (int i = 0; i < n; i++) {
            double tmp = taxes[i] / 100 * incomes[i];

            if (max < tmp) {
                max = tmp;
                companyNo = i + 1;
            }
        }

        System.out.println(companyNo);

    }
}
