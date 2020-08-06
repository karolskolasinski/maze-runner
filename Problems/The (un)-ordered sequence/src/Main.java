import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean orderAsc = true;
        boolean orderDesc = true;
        int previousAsc = Integer.MIN_VALUE;
        int previousDesc = Integer.MAX_VALUE;

        while (scanner.hasNext()) {
            int next = scanner.nextInt();

            if (next == 0) {
                break;
            }

            if (previousAsc > next) {
                orderAsc = false;
            }

            if (previousDesc < next) {
                orderDesc = false;
            }

            previousAsc = next;
            previousDesc = next;
        }

        if (orderAsc && !orderDesc) {
            System.out.println(true);
        }

        if (!orderAsc && orderDesc) {
            System.out.println(true);
        }

        if (orderAsc && orderDesc) {
            System.out.println(true);
        }

        if (!orderAsc && !orderDesc) {
            System.out.println(false);
        }


    }
}
