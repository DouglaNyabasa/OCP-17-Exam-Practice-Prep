
import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference{
    public  void printInstanceMethod (String s){
      System.out.println(s);
    }


    public static void main(String[] args){
       InstanceMethodReference instance = new InstanceMethodReference();
       List<String> anime = Arrays.asList("Naruto","Demon slayer","DBZ");
       anime.forEach(instance::printInstanceMethod);
    }


}

