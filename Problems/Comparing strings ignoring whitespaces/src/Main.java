import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        boolean equals = s1.trim().replace(" ", "").equals(s2.trim().replace(" ", ""));

        System.out.println(equals);
    }
}
