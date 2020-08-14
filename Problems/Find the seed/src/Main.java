import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int seed = 0;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            int localMax = Integer.MIN_VALUE;
            int localSeed = 0;

            for (int j = 0; j < n; j++) {
                int nextRandom = random.nextInt(k);

                if (localMax < nextRandom) {
                    localMax = nextRandom;
                    localSeed = i;
                }
            }

            if (min > localMax) {
                min = localMax;
                seed = localSeed;
            }

        }

        System.out.println(seed);
        System.out.println(min);
    }
}
