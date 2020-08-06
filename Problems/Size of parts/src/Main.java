import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < elements; i++) {
            int part = scanner.nextInt();

            if (part == 1) {
                larger++;
            }

            if (part == -1) {
                smaller++;
            }


            if (part == 0) {
                perfect++;
            }
        }

        System.out.print(String.format("%d %d %d", perfect, larger, smaller));


    }
}
