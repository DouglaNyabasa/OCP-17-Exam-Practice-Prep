import java.util.Deque;
import java.util.LinkedList;


public class DequeueMethods {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("sasuke");
        deque.offerLast("shikamaru");
        deque.getFirst();
        deque.offerLast("shikamaru");
        deque.getFirst();
	deque.offerLast("kakashi sempai");
	deque.pollFirst();
	deque.removeFirst();
        System.out.println(deque.peekFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.peekLast());




    }
}

