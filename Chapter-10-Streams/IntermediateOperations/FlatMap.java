import java.util.List;
import java.util.stream.Stream;


public class FlatMap{
 public static void main(String [] args){
   List<String> fighters = List.of();
   var group1 = List.of("Itachi","Jeraiya","Kakashe hatake");
   var group2 = List.of("Obito","Madara Uchiha","Sakura");
   var group3 = List.of("Naruto","Sasuke","Ourochimaru");
   Stream<List<String>> chuninExamFights = Stream.of(fighters,group1,group2,group3);
   chuninExamFights.flatMap(x -> x.stream()).forEach(System.out::println);
 }
}
