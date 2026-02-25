import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedBlocksExample {
    private int sheepCount = 0;
    private void incrementAndReport(){
        synchronized(this){
            System.out.print((++sheepCount)+" ");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
       try {
           SynchronizedBlocksExample task = new SynchronizedBlocksExample();
           for (int i = 0; i < 10 ; i ++){
               service.submit(()-> task.incrementAndReport());
           }
       }catch (Exception e){
           service.shutdown();
       }
    }
}

