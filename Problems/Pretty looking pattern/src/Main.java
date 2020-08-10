import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[4][4];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.next().split("");
        }

        boolean isPretty = true;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) &&
                        matrix[i][j].equals(matrix[i + 1][j]) &&
                        matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    isPretty = false;
                    break;
                }
            }
        }

        System.out.println(isPretty ? "YES" : "NO");
    }
}
