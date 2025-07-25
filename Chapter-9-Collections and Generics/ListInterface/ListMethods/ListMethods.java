import java.util.ArrayList;
import java.util.List;


public class ListMethod{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dragon ball z");
        list.add("jujutsu kaisen");
        System.out.println(list);
        System.out.println("==================================");
        list.add(0,"attack on titan");
        System.out.println(list);
        System.out.println("===================================");
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);


    }

}
