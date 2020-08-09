import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int integer = scanner.nextInt();
        int sum = 0;

        for (int value : array) {
            if (value > integer) {
                sum += value;
            }
        }

        System.out.println(sum);

    }
}
