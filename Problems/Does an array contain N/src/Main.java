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
        boolean contain = false;

        for (int value : array) {
            if (value == integer) {
                contain = true;
                break;
            }
        }

        System.out.println(contain);

    }
}
