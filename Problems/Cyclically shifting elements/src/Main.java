import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int[] array = new int[scanner.nextInt()];

        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        array[0] = scanner.nextInt();

        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
    }
}
