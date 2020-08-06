import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tmp;

        do {
            tmp = scanner.nextInt();
            sum += tmp;
        } while (tmp != 0);

        System.out.println(sum);

    }
}
