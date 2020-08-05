import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        int one = scanner.nextInt();
//        int two = scanner.nextInt();
//        int three = scanner.nextInt();
//        int counter = 0;
//
//        if (one > 0) {
//            counter++;
//        }
//
//        if (two > 0) {
//            counter++;
//        }
//
//        if (three > 0) {
//            counter++;
//        }
//
//        System.out.println(counter == 1);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;

        boolean exactlyOneIsPositive =
                onlyFirstIsPositive ||
                        onlySecondIsPositive ||
                        onlyThirdIsPositive;

        System.out.println(exactlyOneIsPositive);

    }
}
