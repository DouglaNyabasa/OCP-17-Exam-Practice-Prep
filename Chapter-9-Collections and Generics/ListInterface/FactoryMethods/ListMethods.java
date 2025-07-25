import java.util.Arrays;
import java.util.List;


public class ListMethod{
    public static void main(String[] args) {
        String[] array = new String[]{"goku","naruto","ichigo"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        array[0] = "vegita";
        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);
        asList.set(0,"light yagami");
        System.out.println(asList);
    }

}
