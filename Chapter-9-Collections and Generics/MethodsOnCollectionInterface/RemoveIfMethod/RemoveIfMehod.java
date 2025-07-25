

import java.util.ArrayList;
import java.util.Collection;

public class RemovingMethod {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("jujutsu kaisen");
        list.add("bleach");
	list.add("");
        list.removeIf(s-> s.startsWith("j"));
	list.removeIf(String::isEmpty);
        System.out.println(list.size());
    }


}

