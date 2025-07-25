

import java.util.ArrayList;
import java.util.Collection;

public class RemovingMethod {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("jujutsu kaisen");
        list.add("bleach");
        list.remove("bleach");
        System.out.println(list.contains("bleach"));
	list.clear();
        System.out.println(list);
    }


}

