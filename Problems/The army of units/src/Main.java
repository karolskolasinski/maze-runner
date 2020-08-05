import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int unit = scanner.nextInt();

        if (unit < 1) {
            System.out.println("no army");
        } else if (unit <= 19) {
            System.out.println("pack");
        } else if (unit <= 249) {
            System.out.println("throng");
        } else if (unit <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

    }
}
