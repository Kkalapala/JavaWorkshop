package ChapterTwentyTwo;

class MyThread7 implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        int sleepTime = (int) (Math.random() * 5000);

        System.out.println(name + ": Sleep for: " + sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie.getMessage());
        }

        System.out.println(name + ": Thread " + name + " running");
        for (int i = 0; i < 3; i++) {
            System.out.println(name + ": count: " + i);
        }
    }
}

public class example229 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new MyThread7());
        threadA.setName("A");

        Thread threadB = new Thread(new MyThread7());
        threadB.setName("B");

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("This is the end");
    }
}
