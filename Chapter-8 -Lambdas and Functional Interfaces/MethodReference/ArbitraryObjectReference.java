
import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectReference{
   
    public static void main(String[] args){
       List<String> anime = Arrays.asList("Naruto","Demon slayer","DBZ");
       anime.forEach(System.out::println);
    }


}

