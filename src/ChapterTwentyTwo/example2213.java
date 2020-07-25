package ChapterTwentyTwo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadA implements Runnable {
    private String name;

    MyThreadA (String _name) {
        name = _name;
    }

    public void pause(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ie) {
            System.out.println(name + ": Exception: " + ie.getMessage());
        }
    }

    public void run() {
        System.out.println(name + ": start");
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": operation: " + i);
            pause(100);
        }

        System.out.println(name + ": stop");
    }
}

public class example2213 {
    public static void main(String[] args) {
        int POOL_SIZE = 5;
        int TOTAL_THREADS = 10;

        //create an array of threads
        Runnable[] threads = new MyThreadA[TOTAL_THREADS];

        //systematically create threads named A, B, C ...
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThreadA(Character.toString((char)('A' + i)));
        }

        //construct the thread
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);

        // send the threads to the pool and let it run them
        for (int i = 0; i < threads.length; i++) {
            pool.execute(threads[i]);
        }

        // end
        pool.shutdown();
        System.out.println("the end, my friend");
    }
}
