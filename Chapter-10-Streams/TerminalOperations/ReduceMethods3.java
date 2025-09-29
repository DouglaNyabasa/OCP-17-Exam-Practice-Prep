import java.util.stream.Stream;

public class ReduceMethods3 {

    public static void main(String[] args) {
        Stream<String> letters = Stream.of("A", "N", "I", "M", "E");
        int combine = letters.reduce(0,(s,i)->s+i.length(),(a,b)->a+b);
        System.out.println(combine);

    }
}

