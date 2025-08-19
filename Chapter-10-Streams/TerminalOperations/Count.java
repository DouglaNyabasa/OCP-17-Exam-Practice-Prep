import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        Stream<String> animeshows = Stream.of("dragon ball z", "attack on titan ","black clover ");
        System.out.println(animeshows.count());


    }
}
