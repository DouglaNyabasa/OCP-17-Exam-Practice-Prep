import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfNullableExample {


    public static void main(String[] args) {
        List<String> characters = Arrays.asList("kakashi hatake", "Lady Tsunade", "Ourochimaru",null,"Minato", "Guy Sense", null);


        List<String> results = characters.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
          results.forEach(System.out::println);
    }
}

