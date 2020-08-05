import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final boolean one = a + b > c;
        final boolean two = a + c > b;
        final boolean three = b + c > a;

        System.out.println(one && two && three ? "YES" : "NO");

    }
}
