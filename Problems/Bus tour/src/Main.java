import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean notCrash = true;

        for (int i = 0; i < numberOfBridges; i++) {
            if (bus >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + (i + 1));
                notCrash = false;
                break;
            }
        }

        if (notCrash) {
            System.out.println("Will not crash");
        }


    }
}
