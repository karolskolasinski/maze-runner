import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

//        int counter = 0;
//
//        for (int i = a; i <= b; i++) {
//            if (i % n == 0) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);

        System.out.println((b - a) / n + 1);


    }
}
