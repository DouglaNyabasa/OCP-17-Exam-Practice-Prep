import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Goku");
        set.add("Naruto");
        set.add("Ourochimaru");
        set.add("Goku");
        set.forEach(System.out::println);
    }
}

