import java.util.List;
import java.util.function.Predicate;


public class Matching {

    public static void main(String[] args) {
        var list = List.of("1 peace", "attack on titan ","black clover ","JJK");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println("any match is" + " " + list.stream().anyMatch(pred)); 
        System.out.println("all match is" + " " +  list.stream().allMatch(pred)); 
        System.out.println("none match is" + " " +  list.stream().noneMatch(pred)); 





    }
}

