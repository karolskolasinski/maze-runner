import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sizeSquared = size * size;

        int[][] matrix = new int[sizeSquared][sizeSquared];

        for (int i = 0; i < sizeSquared; i++) {
            for (int j = 0; j < sizeSquared; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int[][] tmp = new int[size][size];

        for (int m = 0; m < sizeSquared; m += size) {

            for (int i = 0, l = 0; i < sizeSquared; i++, l++) {
                for (int j = m, k = 0; j < size + m; j++, k++) {
                    tmp[l][k] = matrix[i][j];


                }

                if (l == size - 1) {
                    l = 0;
                }
            }

        }


//        // lines
//        for (int[] ints : matrix) {
//            for (int j = 0; j < matrix.length; j++) {
//                Arrays.sort(ints);
//            }
//        }
//
//
//        for (int[] ints : matrix) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(ints[j] + " ");
//            }
//            System.out.println();
//        }
    }
}
