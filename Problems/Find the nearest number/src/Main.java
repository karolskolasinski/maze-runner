import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> collect = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = collect
                .stream()
                .map(integer -> Math.abs(integer - n))
                .collect(Collectors.toCollection(ArrayList::new));

        int min = Collections.min(arrayList);
        List<Integer> results = new ArrayList<>(collect.size());

        for (int i = 0; i < collect.size(); i++) {
            int integer = arrayList.get(i);

            if (integer == min) {
                results.add(collect.get(i));
            }
        }

        Collections.sort(results);
        results.forEach(integer -> System.out.print(integer + " "));

    }
}
