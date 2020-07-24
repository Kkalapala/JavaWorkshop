package ChapterTwentyTwo;

class MyThread6 implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + ": Thread " + name + " running");

        for (int i = 0; i < 3; i++) {
            System.out.println(name + ": count: " + i);
        }
    }
}

public class example228 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new MyThread6());
        threadA.setName("A");

        Thread threadB = new Thread(new MyThread6());
        threadB.setName("B");

        threadA.start();
        threadA.join();

        threadB.start();
        threadB.join();

        System.out.println("This is the end.");
    }
}
