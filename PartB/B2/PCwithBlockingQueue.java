//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.*;

public class PCwithBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);

        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    blockingQueue.put(value);

                    System.out.println("Produced " + value);

                    value++;

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = blockingQueue.take();

                    System.out.println("Consume " + value);

                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
