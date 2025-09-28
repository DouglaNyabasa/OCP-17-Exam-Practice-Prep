import java.util.stream.Stream;

public class ReduceMethod {

    public static void main(String[] args) {
        Stream<String> anime = Stream.of("D", "B", "Z");
        String reduce = anime.reduce("", (a, b) -> a + b);
        System.out.println(reduce);
    }
}

