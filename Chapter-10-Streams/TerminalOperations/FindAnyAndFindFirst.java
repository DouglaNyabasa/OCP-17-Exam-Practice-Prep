import java.util.stream.Stream;

public class FindAnyAndFindFirst {

    public static void main(String[] args) {
        Stream<String> animeshows = Stream.of("dragon ball z", "attack on titan ","black clover ","JJK");
        Stream<String> animeshows1 = Stream.generate(()-> "anime");
        animeshows.findAny().ifPresent(System.out::println);


        animeshows1.findFirst().ifPresent(System.out::println);



    }
}
