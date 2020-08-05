import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        LocalTime first = LocalTime.of(hours1, minutes1, seconds1);

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        LocalTime second = LocalTime.of(hours2, minutes2, seconds2);

        long elapsedMinutes = Duration.between(first, second).toSeconds();
        System.out.println(elapsedMinutes);

    }
}
