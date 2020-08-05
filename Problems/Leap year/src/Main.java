import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        System.out.println(isLeap ? "Leap" : "Regular");

    }
}
