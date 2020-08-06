import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//
//        for (int i = 1; i <= n; i++) {
//            int square = i * i;
//            if (square <= n) {
//                System.out.println(square);
//            } else {
//                break;
//            }
//        }

        final int maximum = new Scanner(System.in).nextInt();

        int counter = 1;
        int square;

        while ((square = counter * counter++) <= maximum) {
            System.out.println(square);
        }


    }
}
