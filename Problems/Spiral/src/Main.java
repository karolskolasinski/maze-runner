import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int integer = 1;


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++, integer++) {
                matrix[i][j] = integer;
            }

            for (int j = i + 1; j < n - i; j++, integer++) {
                matrix[j][n - 1 - i] = integer;
            }

            for (int j = n - 2 - i; j >= i; j--, integer++) {
                matrix[n - 1 - i][j] = integer;
            }

            for (int j = n - 2 - i; j >= i + 1; j--, integer++) {
                matrix[j][i] = integer;
            }
        }


        for (int[] ints : matrix) {
            for (int element : ints) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }


    }
}
