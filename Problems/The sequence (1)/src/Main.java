import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sequence = scanner.nextInt();
        int tmp = 1;
        int counter = 0;

        for (int i = 0; i < sequence; i++, tmp++) {
            for (int j = 1; j <= tmp; j++) {
                if (counter < sequence) {
                    System.out.print((i + 1) + " ");
                    counter++;
                }
            }
        }

    }
}
