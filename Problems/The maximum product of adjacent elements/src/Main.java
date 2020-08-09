import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        int product = 0;

        for (int i = 0; i < array.length    ; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            int tmp = array[i] * array[i + 1];

            if (tmp > product) {
                product = tmp;
            }
        }

        System.out.println(product);

    }
}
