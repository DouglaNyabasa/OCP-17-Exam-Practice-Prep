import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorClass {

    public static void main(String[] args) {
        Stream<String> originalstream = Stream.of("superman vs batman", "mission impossible","doomsday avangers","thunder-bolts","james bond","fantastic 4","lame james gun superman");
        Spliterator<String> spliteratorObj = originalstream.spliterator();
        Spliterator<String> firsthalf = spliteratorObj.trySplit();
        spliteratorObj.forEachRemaining(System.out::println);
        System.out.println("==============================================");
        firsthalf.forEachRemaining(System.out::println);
        System.out.println("==============================================");
       



    }
}

