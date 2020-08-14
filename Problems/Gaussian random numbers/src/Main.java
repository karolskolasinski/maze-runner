import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int k = scanner.nextInt();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();

        int counter = 0;
        int seed;

        do {
            Random random = new Random(k);

            for (int i = 0; i < n; i++) {
                double nextGaussian = random.nextGaussian();
                if (nextGaussian <= m) {
                    counter++;
                } else {
                    break;
                }
            }

            if (counter == n) {
                seed = k;
                break;
            } else {
                counter = 0;
            }

            k++;
        } while (true);

        System.out.println(seed);

    }
}
