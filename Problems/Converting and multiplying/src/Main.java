import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String next = scanner.next();

            if ("0".equals(next)) {
                break;
            }

            try {
                System.out.println(Integer.parseInt(next) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + next);
            }

        }


    }

}
