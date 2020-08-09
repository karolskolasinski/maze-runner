import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ". ";
            }
        }


        for (int i = 0, k = matrix.length - 1; i < n; i++, k--) {
            for (int j = 0; j < n; j++) {
                // horizontal
                if (i == n / 2) {
                    matrix[i][j] = "* ";
                }

                // vertical
                if (j == n / 2) {
                    matrix[i][j] = "* ";
                }
            }

            // diagonal 1
            matrix[i][i] = "* ";

            // diagonal 2
            matrix[k][i] = "* ";
        }


        for (String[] strings : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }

    }
}
