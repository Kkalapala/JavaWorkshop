package ChapterTwo;

//using while loop and do while loop

public class example214 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        //while loop
        while (i < 10 ) {
            System.out.println("Odd : " + i);
            i += 2;
        }

        //do-while loop
        do {
            System.out.println("Even : " + j);
            j += 2;
        } while (j < 10);
    }
}
