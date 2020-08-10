import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int[][] matrix = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//
//        int[][] result = new int[m][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                result[m - (m - j)][(n - 1) - i] = matrix[i][j];
//            }
//        }
//
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[matrix.length - j - 1][i] + " ");
            }
            System.out.println();
        }

    }
}
