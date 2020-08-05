import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desks = 0;

        while (scanner.hasNext()) {
            int students = scanner.nextInt();
            desks += students / 2 + students % 2;
        }

        System.out.println(desks);
    }
}
