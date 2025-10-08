import java.util.concurrent.*;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Running :: "+Thread.currentThread().getName());
    }
}

public class Multi {

    public static void main(String[] args) {

        ThreadFactory factory = r -> {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setName("AppWorker-" + t.getId());
            return t;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2, factory);

        /**
             Executors.newSingleThreadExecutor();
         * Creates a thread pool with only one worker thread.
         * All tasks are executed sequentially in the order they are submitted.
         * If the single thread dies (unexpectedly), the executor will create a new one.
         * Useful when you want tasks to run one after another (like a queue).

         **/

        MyRunnable task1 = new MyRunnable();
        MyRunnable task2 = new MyRunnable();
        MyRunnable task3 = new MyRunnable();

        Runnable runnable = () -> {
            System.out.println("Runnable Running Thread Name ::"+Thread.currentThread().getName());
        };

        Callable<Integer> callable = () -> {
            int count = 0;
            System.out.println("Running Thread Name ::"+Thread.currentThread().getName());
            return ++count;
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        Future<Integer> future = executorService.submit(callable);

        if(future.isDone()){
            int result;
            try {
                 result = future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
            System.out.println("result :: "+result);
        }

        System.out.println("Callable Called");
        executorService.shutdown();

    }

}
