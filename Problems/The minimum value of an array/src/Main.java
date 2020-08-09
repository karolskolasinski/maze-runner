import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
