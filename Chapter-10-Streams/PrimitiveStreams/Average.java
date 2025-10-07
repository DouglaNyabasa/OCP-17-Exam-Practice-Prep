import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalDouble average = intStream.average();
        if(average.isPresent()) {
            System.out.println(average.getAsDouble());
        }else {
            System.out.println("Not found");
        }

    }
}

