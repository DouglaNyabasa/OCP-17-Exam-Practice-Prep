import java.util.ArrayList;
import java.util.Collection;

public class IteratingMethod {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("jujutsu kaisen");
        list.add("bleach");
        list.forEach(System.out::println);
        System.out.println("=============================================");
        list.add("one piece");
        list.forEach(s -> System.out.println(s));
    }


}

