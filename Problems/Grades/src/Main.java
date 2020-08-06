import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < elements; i++) {
            switch (scanner.nextInt()) {
                case 2:
                    d++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    b++;
                    break;
                case 5:
                    a++;
                    break;
                default:
                    break;
            }
        }

        System.out.print(String.format("%d %d %d %d", d, c, b, a));
    }
}
