import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> helpStack = new ArrayDeque<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String next = scanner.next();

            switch (next) {
                case "push":
                    int nextInt = scanner.nextInt();
                    stack.push(nextInt);

                    if (stack.size() == 1) {
                        helpStack.push(nextInt);
                        break;
                    }

                    if (!helpStack.isEmpty() && nextInt > helpStack.peek()) {
                        helpStack.push(nextInt);
                    } else {
                        helpStack.push(helpStack.peek());
                    }
                    break;
                case "max":
                    System.out.println(helpStack.peek());
                    break;
                case "pop":
                    stack.pop();
                    helpStack.pop();
                    break;
                default:
                    break;
            }
        }

    }
}
