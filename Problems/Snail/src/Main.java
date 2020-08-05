import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int target = 0;
        int counter = 0;

        while (target < h) {
            target += a;
            if (target < h) {
                target -= b;
            }
            counter++;
        }

        System.out.println(counter);
    }
}
