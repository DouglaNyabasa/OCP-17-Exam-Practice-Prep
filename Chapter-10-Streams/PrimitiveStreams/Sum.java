import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class Sum {
    public static void main(String[] args) {
        IntStream ints = IntStream.of(1, 2,3,4,5,6,7);
        int sum = ints.sum();
        System.out.println(sum);
        DoubleStream doubles = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        double sum2 = doubles.sum();
        System.out.println(sum2);


    }
}

