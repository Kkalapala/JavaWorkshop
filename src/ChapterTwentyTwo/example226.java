package ChapterTwentyTwo;

class MyThread4 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Thread " +
                Thread.currentThread().getName() + " running");

        System.out.println(Thread.currentThread().getName() + ": ID " +
                Thread.currentThread().getId());

        System.out.println(Thread.currentThread().getName() + ": Priority " +
                Thread.currentThread().getPriority());
    }
}

public class example226 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread4());
        threadA.setName("A");
        threadA.setPriority(Thread.MAX_PRIORITY);

        Thread threadB = new Thread(new MyThread4());
        threadB.setName("B");
        threadB.setPriority(Thread.MIN_PRIORITY);

        threadA.start();
        threadB.start();
    }
}
