import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("naruto has "+t+" episodes");
        consumer.accept(500);
    }

}
