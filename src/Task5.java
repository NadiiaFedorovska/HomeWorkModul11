import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {
        MixingStreams mixingStreams = new MixingStreams();
        Stream<String> first = Stream.of("First", "Second", "Third", "Fourth");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");

        Stream<String> result = MixingStreams.zip(first, second);

        result.peek(System.out::println)
                .collect(Collectors.toList());
    }

}
