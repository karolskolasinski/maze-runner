import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int divisible = 0;

        for (int i = 0; i < elements; i++) {
            int temp = scanner.nextInt();

            if (temp % 4 == 0 && temp > divisible) {
                divisible = temp;
            }
        }

        System.out.println(divisible);

    }
}
