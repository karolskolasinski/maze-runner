import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//
//        boolean inOrder = true;
//        int tmp = 0;
//
//        for (int i = 0; i < size; i++) {
//            int nextInt = scanner.nextInt();
//
//            if (nextInt < tmp) {
//                inOrder = false;
//                break;
//            }
//
//            tmp = nextInt;
//        }
//
//        System.out.println(inOrder);


        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        boolean inOrder = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                inOrder = false;
                break;
            }
        }

        System.out.println(inOrder);

    }
}
