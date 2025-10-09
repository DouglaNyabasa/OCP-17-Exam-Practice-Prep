
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToObject {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = intStream.mapToObj(x -> x * x);
        integerStream.filter(x->x>10).forEach(System.out::println);


    }
}

