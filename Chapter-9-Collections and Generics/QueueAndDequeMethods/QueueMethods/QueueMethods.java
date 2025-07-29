import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
	queue.add("sasuke");
	queue.offer("shikamaru");
	queue.add("hinata");
	System.out.println(queue.peek());
	System.out.println(queue.element());
	System.out.println(queue.remove("sasuke"));
	System.out.println(queue.poll());


    }
}

