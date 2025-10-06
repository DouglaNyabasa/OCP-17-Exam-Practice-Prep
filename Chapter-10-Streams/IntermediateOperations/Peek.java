import java.util.stream.Stream;


public class Peek{
    public static void main(String [] args){
        Stream<String> chars = Stream.of("jjk" ,"black clover","hunter x","aot","bdz","baki");
        chars.filter(x-> x.length() <=3).peek(System.out::println).limit(2).forEach(System.out::println);
    }
}

