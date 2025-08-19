import java.util.stream.Stream;

public class inAndMax{
    public static void main(String[] args) {
        Stream<String> animeshows = Stream.of("dragon ball z", "attack on titan ","black clover ","JJK");
       Stream<String> animeshows1 = Stream.of("dragon ball z", "attack on titan ","black clover ","JJK","demon slayer");
        System.out.println(animeshows.min((a,b)-> a.length()-b.length()));
        System.out.println(animeshows1.max((a,b)-> a.length()-b.length()));
    }
}
