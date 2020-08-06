import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int nextInt = scanner.nextInt();

            if (nextInt == 0) {
                break;
            }

            System.out.println(nextInt % 2 == 0 ? "even" : "odd");
        }


    }
}
