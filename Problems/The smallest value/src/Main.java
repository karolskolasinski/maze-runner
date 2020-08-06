import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        long m = scanner.nextLong();
//
//        long fact = 1;
//        int i = 2;
//
//        while (true) {
//
//            if ((fact = fact * i) > m) {
//                System.out.println(i);
//                break;
//            }
//
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long res = 1;
        int mult = 1;

        while (res <= number) {
            mult++;
            res *= mult;
        }

        System.out.print(mult);


    }
}
