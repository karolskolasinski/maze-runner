import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean occurAsc = false;
        boolean occurDesc = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                occurAsc = true;
                break;
            }

            if (array[i] == m && array[i + 1] == n) {
                occurDesc = true;
                break;
            }
        }

        System.out.println(occurAsc || occurDesc);

    }
}
