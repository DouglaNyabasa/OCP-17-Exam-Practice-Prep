import java.util.ArrayList;
import java.util.Collection;

public class CountMethod {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("jujutsu kaisen");
        list.add("bleach");
        list.add("bleach");

        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }


}
