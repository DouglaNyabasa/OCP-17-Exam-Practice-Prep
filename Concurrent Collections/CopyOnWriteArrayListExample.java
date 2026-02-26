import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<Integer> number = new  CopyOnWriteArrayList<>(List.of(1,2,3));
        for (var n :number){
            System.out.println(n + " ");
            number.add(n+1);
        }
        System.out.println();
        System.out.println("Numbers size" +" "+ number.size());
    }
}

