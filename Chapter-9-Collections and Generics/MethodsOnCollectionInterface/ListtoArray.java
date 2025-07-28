import java.util.ArrayList;
import java.util.List;


public class ListtoArray{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dragon ball z");
        list.add("jujutsu kaisen");
        System.out.println(list);
        System.out.println("==================================");
        list.add(0,"attack on titan");
        Object[] arrayObj = list.toArray();
        String[] arrayString = list.toArray(new String[0]);
        System.out.println(arrayObj.length);
        System.out.println(arrayString.length);



    }

}
