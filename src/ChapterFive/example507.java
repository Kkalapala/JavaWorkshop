package ChapterFive;

public class example507 {
    public static void main(String[] args) {
        //declare a string with nothing inside
        String text = null;

        //will be seen at the console
        System.out.println("Go Java Go!");

        try {
            //null'ed strings could crash program
            System.out.println(text.length());
        } catch (NullPointerException ex) {
            System.out.println("Exception: Cannot get the text's length");
        }

        //this print can now be seen
        System.out.println("done");
    }
}
