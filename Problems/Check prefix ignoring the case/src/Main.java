import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        boolean b = s.charAt(0) == 'j' || s.charAt(0) == 'J';
        System.out.println(b);
    }
}
