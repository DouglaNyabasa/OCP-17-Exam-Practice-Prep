import java.util.stream.Stream;


public class Sorted{
  public static void main(String [] args){
   Stream<String> chars = Stream.of("jujutsu" ,"black clover","hunter x","bungo stray dogs");
   chars.sorted().forEach(System.out::println);
  }
}
