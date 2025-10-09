import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinAndMax {
    public static void main(String[] args) {
        IntStream ints = IntStream.of(1,2,3,4,5,6,7,8,9);
        IntStream ints2 = IntStream.of(1,2,3,4,5,6,7,8,9);
        OptionalInt min = ints.min();
        OptionalInt max = ints2.max();
        System.out.println(min.getAsInt());
        System.out.println(max.getAsInt());
    }
}

