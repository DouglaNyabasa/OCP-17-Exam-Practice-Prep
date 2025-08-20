import java.util.stream.Stream;

public class Distinct{
  public static void main(String [] args){
  Stream<String> character = Stream.of("asta","asta","asta","midoria","nezuko");
  character.distinct().forEach(x -> System.out.println(x));
  }
}

