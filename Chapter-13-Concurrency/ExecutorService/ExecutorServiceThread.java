import java.util.concurrent.*;

public class ExecutorServiceThread {
private static int counter = 0;

        public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> results = service.submit(() -> {
                for (int i = 0; i < 1000; i++) counter++;

            }
            );
            results.get(10,TimeUnit.SECONDS);
            System.out.println("Reached: " + counter);
        }catch (TimeoutException e){
            System.out.println("Timeout");
        }
        finally {
            service.shutdown();
        }
    }

}
