import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // put your code here

        final int cups = scanner.nextInt();
        final boolean weekend = scanner.nextBoolean();

        final boolean workDays = cups <= 20 && cups >= 10 && !weekend;
        final boolean weekends = cups <= 25 && cups >= 15 && weekend;

        System.out.println(workDays || weekends);

    }
}
