import java.util.stream.Stream;

public class Filtering{
  public static void main(String [] args){
  Stream<String> character = Stream.of("goku","asta","midoria","nezuko");
  character.filter(x-> x.startsWith("a")).forEach(System.out::print);
  }
}
