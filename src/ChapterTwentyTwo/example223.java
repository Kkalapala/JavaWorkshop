package ChapterTwentyTwo;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running.");
    }
}
public class example223 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread());
        threadA.setName("A");
        Thread threadB = new Thread(new MyThread());
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
