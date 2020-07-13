package ChapterFive;

//introducing a simple exception
public class example501 {
    public static void main(String[] args) {
        //declare a string with nothing inside
        String text = null;

        //will be seen at the console
        System.out.println("Go Java Go!");

        //null'ed strings should crash program
        System.out.println(text.length());

        //this print will never be seen
        System.out.println("done");
    }
}
