import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(1, 100);
        IntStream ints2 = IntStream.rangeClosed(1, 100);
        ints.forEach(System.out::println);
        System.out.println("=======================================================");
        ints2.forEach(System.out::println);

    }
}

