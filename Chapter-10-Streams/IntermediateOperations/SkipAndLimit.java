import java.util.stream.Stream;

public class SkipAndLimit{
	public static void main(String[] args){
	Stream<Integer> numb = Stream.iterate(1, n -> n+1);
	numb.skip(5).limit(5).forEach(x-> System.out.println(x));
	}

}
