//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] guests = new String[8];

        guests[0] = scanner.next();
        guests[1] = scanner.next();
        guests[2] = scanner.next();
        guests[3] = scanner.next();
        guests[4] = scanner.next();
        guests[5] = scanner.next();
        guests[6] = scanner.next();
        guests[7] = scanner.next();

        for (int i = guests.length; i > 0; i--) {
            System.out.println(guests[i - 1]);
        }

    }
}
