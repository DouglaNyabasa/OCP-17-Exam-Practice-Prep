import java.util.List;

public class ParallelDecompositionExample {

    private static int doWork(int input){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        return  input;
    }

    public static void main(String[] args) {
        ParallelDecompositionExample ps1 = new ParallelDecompositionExample();
        long start = System.currentTimeMillis();
        //we used a normal stream it gave us 25 seconds
//        List.of(1,2,3,4,5)
//                .stream()
//                .map(w-> doWork(w))
//                .forEach(s-> System.out.println(s + " "));
          //we user parallel decomposition it took us 5 seconds
        List.of(1,2,3,4,5)
                .parallelStream()
                .map(w-> doWork(w))
                .forEachOrdered(s-> System.out.println(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start)/1000;
        System.out.println("Time taken  "+timeTaken +" Seconds");
    }
}

