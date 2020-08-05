import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        String next = scanner.next();
        String[] split = next.split("");
        int sum = 0;

        for (String s : split) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }
}
