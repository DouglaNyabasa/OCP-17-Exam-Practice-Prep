import java.util.Arrays;
import java.util.List;

public class StaticMethodReference{
    public static void printStaticMethod (String s){
      System.out.println(s);
    }


    public static void main(String[] args){
       List<String> anime = Arrays.asList("Naruto","Demon slayer","DBZ");
       anime.forEach(StaticMethodReference::printStaticMethod);
    }


}
