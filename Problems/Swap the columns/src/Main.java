import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int[][] matrix = new int[i][j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int tmp;

        for (int k = 0; k < i; k++) {
            tmp = matrix[k][n];
            matrix[k][n] = matrix[k][m];
            matrix[k][m] = tmp;
        }

        for (int[] ints : matrix) {
            for (int l = 0; l < j; l++) {
                System.out.print(ints[l] + " ");
            }
            System.out.println();
        }

    }
}
