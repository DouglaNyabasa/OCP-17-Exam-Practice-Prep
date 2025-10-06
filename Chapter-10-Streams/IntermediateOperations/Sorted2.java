import java.util.Comparator;
import java.util.stream.Stream;


public class Sorted22{
    public static void main(String [] args){
        Stream<String> chars = Stream.of("jjk" ,"black clover","hunter x","aot");
        chars.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

