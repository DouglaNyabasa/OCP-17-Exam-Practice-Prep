import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceMethods1 {

    public static void main(String[] args) {
        BinaryOperator<Integer> operator = (a, b) -> a * b;
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        numbers.reduce(operator).ifPresent(System.out::println);
        empty.reduce(operator).ifPresent(System.out::println);
        oneElement.reduce(operator).ifPresent(System.out::println);

    }
}

