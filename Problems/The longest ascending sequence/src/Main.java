import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int tmp = 1;
        int max = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                tmp++;
                if (max < tmp) {
                    max = tmp;
                }
            } else {
                tmp = 1;
            }
        }

        System.out.println(max);

    }
}
