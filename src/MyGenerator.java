import java.util.stream.Stream;

public class MyGenerator {

    public static Stream<Long> generatorStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}

