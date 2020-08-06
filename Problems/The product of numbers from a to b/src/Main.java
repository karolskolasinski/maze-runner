import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long product = 1;

        for (long i = a; i < b; i++) {
            product *= i;
        }

        System.out.println(product);
    }
}
