import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        String next = scanner.next();
        StringBuilder reverse = new StringBuilder(next).reverse();
        int i = Integer.parseInt(reverse.toString());

        System.out.println(i);
    }
}
