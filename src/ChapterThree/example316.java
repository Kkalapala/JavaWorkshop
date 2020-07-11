package ChapterThree;

//anonymous inner classes: they are used to make code more concise
//class is declared and initiated at the same time.

class ContainerAn {
    int c = 17;
    public void print() {
        System.out.println("This is an outer class.");
    }
}

public class example316 {
    public static void main(String[] args) {
        //inner class
        ContainerAn container = new ContainerAn() {
            @Override
            public void print() {
                System.out.println("This is an inner class.");
            }
        };

        container.print();
        System.out.println(container.c);
    }
}
