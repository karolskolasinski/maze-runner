import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int triples = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] + 1 == array[i] && array[i] + 1 == array[i + 1]) {
                triples++;
            }
        }

        System.out.println(triples);

    }
}
