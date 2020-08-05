import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int nextInt = (scanner.nextInt() / 10) % 10;

        System.out.println(nextInt);
    }
}
