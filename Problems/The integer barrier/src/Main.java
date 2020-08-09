import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int next;
//
//        do {
//            next = scanner.nextInt();
//            sum += next;
//
//            if (sum >= 1000) {
//                break;
//            }
//
//        } while (next != 0);
//
//        System.out.println(sum < 1000 ? sum : sum - 1000);

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);

    }
}
