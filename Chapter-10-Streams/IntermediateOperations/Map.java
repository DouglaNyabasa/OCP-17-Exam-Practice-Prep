import java.util.stream.Stream;

public class Map{
    public static void main(String [] args){
        Stream<String> shows = Stream.of("superman vs batman", "mission impossible","doomsday avangers","thunder-bolts");
        shows.map(String::length).limit(3).forEach(System.out::println);
    }
}

