import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int k = scanner.nextInt();
//        boolean flag = false;
//
//
//        for (int i = 0; i < n; i++) {
//            int left = m * (i + 1);
//            if (left == k) {
//                flag = true;
//                break;
//            }
//
//            int right = m * (n - i);
//            if (right == k) {
//                flag = true;
//                break;
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            int up = n * (i + 1);
//            if (up == k) {
//                flag = true;
//                break;
//            }
//
//            int down = n * (m - i);
//            if (down == k) {
//                flag = true;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


//        final int n = scanner.nextInt();
//        final int m = scanner.nextInt();
//        final int k = scanner.nextInt();
//
//        if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        if ((k % n == 0 || k % m == 0) && k <= n * m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
