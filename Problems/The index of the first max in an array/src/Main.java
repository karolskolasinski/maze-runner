import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int counter = 0;

        for (int i = 0; i < elements; i++) {
            int tmp = scanner.nextInt();

            if (max < tmp) {
                max = tmp;
                counter = i;
            }

        }

        System.out.println(counter);
    }
}
