
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(()-> 1+1);
            System.out.println(result.get());
        }finally {
            service.shutdown();
        }
    }
}

