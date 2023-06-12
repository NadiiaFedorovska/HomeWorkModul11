import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<Long> myStream = MyGenerator.generatorStream(0, 25214903917L, 11L, (long) Math.pow(2, 48));
        myStream.limit(5).forEach(System.out::println);
    }
}