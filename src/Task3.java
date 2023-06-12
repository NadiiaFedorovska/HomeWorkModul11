import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] input = {"1, 2, 0", "4, 5"};

        String sortedNumbers = Arrays.stream(input)
                .flatMapToInt(s -> Arrays.stream(s.split(", "))
                .mapToInt(s1 -> Integer.parseInt(s1)))
                .sorted()
                .mapToObj(i -> Integer.toString(i))
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);
    }
}
