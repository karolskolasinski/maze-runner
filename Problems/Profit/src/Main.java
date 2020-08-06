import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();

        int tmp = 0;

        do {
            if (m == k) {
                break;
            }

            tmp++;
            m += m * (p / 100);

        } while (m < k);

        System.out.println(tmp);

    }
}
