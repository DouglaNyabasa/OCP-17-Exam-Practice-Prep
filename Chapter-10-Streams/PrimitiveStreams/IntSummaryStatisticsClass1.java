
import java.util.stream.IntStream;


public class IntSummaryStatisticsClass1 {
    public static void main(String[] args) {
        IntStream ints = IntStream.rangeClosed(0, 100);

        IntStream ints1 = IntStream.rangeClosed(0, 100);
        java.util.IntSummaryStatistics statistics = ints1.summaryStatistics();
        int max = statistics.getMax();
        int min = statistics.getMin();
        long sum = statistics.getSum();
        double avg =  statistics.getAverage();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);







    }
}

