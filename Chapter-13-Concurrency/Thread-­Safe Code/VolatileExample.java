import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileExample {
    private volatile int sheepCount =0;
    private void incrementAndReport(){
        System.out.println((sheepCount = sheepCount + 1)+ "");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
       try {
           VolatileExample task = new VolatileExample();
           for (int i = 0; i < 10 ; i ++){
               service.submit(()-> task.incrementAndReport());
           }
       }catch (Exception e){
           service.shutdown();
       }
    }
}

