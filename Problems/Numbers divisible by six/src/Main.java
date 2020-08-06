import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < elements; i++) {
            int value = scanner.nextInt();
            if (value % 6 == 0) {
                sum += value;
            }
        }

        System.out.println(sum);

    }
}
