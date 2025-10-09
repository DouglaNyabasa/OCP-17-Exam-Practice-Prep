
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Boxed {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = intStream.boxed();
        stream.forEach(System.out::println);



    }
}

