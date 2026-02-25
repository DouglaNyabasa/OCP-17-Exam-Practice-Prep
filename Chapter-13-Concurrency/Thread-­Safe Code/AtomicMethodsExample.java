import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMethodsExample {
    private AtomicInteger sheepCount = new AtomicInteger(0);
    private void incrementAndReport(){
        System.out.println((sheepCount.incrementAndGet())+ "");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
       try {
           AtomicMethodsExample task = new AtomicMethodsExample();
           for (int i = 0; i < 10 ; i ++){
               service.submit(()-> task.incrementAndReport());
           }
       }catch (Exception e){
           service.shutdown();
       }
    }
}

