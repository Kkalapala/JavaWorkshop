package ChapterTwentyTwo;

class MyThread3 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Thread " +
                Thread.currentThread().getName() + " running");

        System.out.println(Thread.currentThread().getName() + ": ID " +
                Thread.currentThread().getId());

        System.out.println(Thread.currentThread().getName() + ": Priority " +
                Thread.currentThread().getPriority());
    }
}

public class example225 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread3());
        threadA.setName("A");
        Thread threadB = new Thread((new MyThread3()));
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
