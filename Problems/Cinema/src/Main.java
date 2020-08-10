import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];


        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int k = scanner.nextInt();
        int row = 0;


        for (int i = 0; i < matrix.length; ++i) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    counter++;
                    if (counter == k) {
                        row = i + 1;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }
            if (row != 0) {
                break;
            }
        }


        System.out.println(row);
    }
}
