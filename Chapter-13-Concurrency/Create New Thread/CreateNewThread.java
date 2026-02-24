public class CreateNewThread {
    //Creating a new task
   public static void pause(){
       try {
           System.out.println("Waiting for new thread...");
           Thread.sleep(10_00);
       }catch (InterruptedException e){}
       System.out.println("thread finished");
   }
    public static void main(String[] args) {

//        new Thread(()-> pause()).start();

        new Thread(CreateNewThread::pause).start();
//        var job = new Thread(()-> pause());
//        job.start();

        System.out.println("Main method finished!");


    }
}

