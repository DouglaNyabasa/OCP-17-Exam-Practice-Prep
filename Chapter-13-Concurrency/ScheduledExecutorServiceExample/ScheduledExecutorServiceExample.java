import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Callable<String> task1 = ()-> "Hello from Callable 1";
        Runnable task2 = ()-> System.out.println("Hello from Runnable");
        scheduledExecutorService.schedule(task1, 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 2, TimeUnit.SECONDS);
    }
}

