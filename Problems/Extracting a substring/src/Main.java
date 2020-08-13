import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        String substring = s.substring(from, to + 1);
        System.out.println(substring);

    }
}
