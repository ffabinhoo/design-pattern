package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future> allFutures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = service.submit(new Task());
            allFutures.add(future);
        }
        System.out.println("finished all futures...");

        for (int i = 0; i < allFutures.size(); i++) {
            try {
                Future<Integer> future = allFutures.get(i);
                if (i > 0 && i%10 == 0){
                    future.cancel(false);
                    System.out.println("Task Future #" + i + " cancelled");
                }
                if (future.isCancelled()){
                    System.out.println("Task Future #" + i + " cancel confirmed");
                }else{
                    System.out.println("Result of Future #" + i + "=(" + future.get() + ")");
                }
            } catch (InterruptedException | ExecutionException | CancellationException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        service.shutdown();
    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(4000);
            return new Random().nextInt();
        }
    }
}