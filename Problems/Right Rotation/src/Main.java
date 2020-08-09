import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int[] array = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        int rotation = scanner.nextInt();
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[(i + rotation) % array.length] = array[i];
        }

        for (int elem : newArray) {
            System.out.print(elem + " ");
        }


    }
}
