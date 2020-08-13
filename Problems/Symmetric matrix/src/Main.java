import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] matrix = new int[n][n];
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//
//
//        int counter = 0;
//
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (matrix[j + i + 1][j] != matrix[j][j + i + 1]) {
//                    counter++;
//                }
//
//            }
//        }
//
//
//        System.out.println(counter == 0 ? "YES" : "NO");


        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextInt();
        var matrix = new int[input][input];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        var result = "YES";


        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    result = "NO";
                    break;
                }
            }
        }


        System.out.println(result);


    }
}
