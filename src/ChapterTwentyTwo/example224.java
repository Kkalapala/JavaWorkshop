package ChapterTwentyTwo;

class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running.");

        System.out.println("ID " + Thread.currentThread().getId());

        System.out.println("Priority " + Thread.currentThread().getPriority());
    }
}

public class example224 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread2());
        threadA.setName("A");
        Thread threadB = new Thread((new MyThread2()));
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
