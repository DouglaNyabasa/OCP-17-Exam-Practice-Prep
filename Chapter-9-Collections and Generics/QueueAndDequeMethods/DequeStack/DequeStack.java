import java.util.ArrayDeque;
import java.util.Deque;



public class DequeStack {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("vegita");
        stack.push("krillin");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.peek());





    }
}

