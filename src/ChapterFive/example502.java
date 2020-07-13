package ChapterFive;

public class example502 {
    public static void main(String[] args) {
        //declare a string of fixed length
        String text = "I <3 bananas"; //12 characters long

        //provoke an exception
        char character = text.charAt(15); //get the 15th element

        //this print will never be seen
        System.out.println("done");
    }
}
