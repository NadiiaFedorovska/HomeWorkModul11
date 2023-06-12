import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bohdan", "Olha", "Dmitro", "Olena", "Pavlo", "Nadiia", "Timur");
        List<String> namesToUpperCase = names.stream()
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(namesToUpperCase);
    }
}
