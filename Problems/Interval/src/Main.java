import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean one = number > -15 && number <= 12;
        boolean two = number > 14 && number < 17;
        boolean three = number >= 19;

        System.out.println(one || two || three ? "True" : "False");

    }
}
