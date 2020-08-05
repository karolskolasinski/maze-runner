import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

//        boolean horizontal = x1 == x2;
//        boolean vertical = y1 == y2;
//        boolean diagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);
//
//        System.out.print(horizontal || vertical || diagonal ? "YES" : "NO");

        boolean isSameX = x1 == x2;
        boolean isSameY = y1 == y2;

        // By interpreting the problem with Linear Algebra, you can
        // compute the solution in O(1) time: Use the slope-point form of Linear
        // Equation (you know the slope, and you have a point given in the input!)
        // to derive a linear equation to handle the diagonals and check whether the
        // second queen is in the line from the first one
        boolean isSameMainDiag = x2 - x1 + y1 == y2;
        boolean isSameSecDiag = -x2 + x1 + y1 == y2;

        boolean isColliding = isSameX || isSameY || isSameMainDiag || isSameSecDiag;

        System.out.println(isColliding ? "YES" : "NO");


    }
}
