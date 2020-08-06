import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int max = 0;

        int i = 0;
        while (i < elements) {
            int nextInt = scanner.nextInt();
            if (nextInt % 4 == 0 && nextInt > max) {
                max = nextInt;
            }
            i++;
        }

        System.out.println(max);
    }
}
