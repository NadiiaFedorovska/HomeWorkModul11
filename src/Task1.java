import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bohdan", "Olha", "Dmitro", "Olena", "Pavlo", "Nadiia", "Timur");
        List<String> result = IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i) + ". " + names.get(i))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}


