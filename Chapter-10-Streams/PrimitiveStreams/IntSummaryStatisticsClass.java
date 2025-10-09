
import java.util.stream.IntStream;


public class IntSummaryStatistics {
    public static void main(String[] args) {
        IntStream ints = IntStream.rangeClosed(0, 100);
        java.util.IntSummaryStatistics statistics = ints.summaryStatistics();
        if(statistics.getAverage() <= 20) throw new RuntimeException();
        else {
            int i = (int) (statistics.getCount() - statistics.getMax());
            System.out.println(i);

        }


    }
}

