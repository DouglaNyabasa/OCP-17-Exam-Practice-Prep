import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntClass {
    public static void main(String[] args) {
        Stream<String> anime = Stream.of("Attack on titan","jujutsu kaisen","Bungo stray dogs", "akamega kill","hells paradise");
        anime.mapToInt(x ->x.length()).forEach(System.out::println);
   
        


    }
}
