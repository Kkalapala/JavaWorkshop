package ChapterTwentyTwo;

class MyOwnThread2 implements Runnable {
    String name = "";

    MyOwnThread2(String _name) {
        name = _name;
    }

    public void run() {
        System.out.println("Thread " + name + " running");
    }
}

public class example222 {
    public static void main(String[] args) {
        MyOwnThread2 threadA = new MyOwnThread2("A");
        MyOwnThread2 threadB = new MyOwnThread2("B");

        threadA.run();
        threadB.run();
    }
}
