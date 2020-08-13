import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        boolean burg = s.endsWith("burg");
        System.out.println(burg);

    }
}
