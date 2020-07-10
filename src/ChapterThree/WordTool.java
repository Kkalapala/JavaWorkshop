package ChapterThree;

//example304

public class WordTool {
    //constructor
    WordTool() {}

    //methods
    //to count the number of words in a string
    public int wordCount (String s) {
        //variable to count words
        int count = 0;

        //if the entry is empty or null, count is 0
        if ( !(s == null || s.isEmpty()) ) {
            //use split method from String class to separate
            //the words having the whitespace as separator
            String[] w = s.split("\\s+");
            count = w.length;
        }
        return count;
    }

    //to count number of letters in a string, with or without whitespace
    public int symbolCount (String s, boolean withSpaces) {
        //variable to count symbols
        int count = 0;

        //if entry is empty or null, count is 0
        if ( !(s == null || s.isEmpty()) ) {
            if (withSpaces) {
                //with whitespaces return the full length
                count = s.length();
            } else {
                //eliminate whitepaces and return length without whitespaces
                count = s.replace(" ", "").length();
            }
        }

        return count;
    }

    public static void main(String[] args) {
        WordTool wt = new WordTool();

        String text = "The river carried the memories from her childhood.";

        //results
        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wt.wordCount(text) );
        System.out.println( "Total words (w. spaces): " + wt.symbolCount(text, true) );
        System.out.println( "Total words (wo. spaces) " + wt.symbolCount(text, false) );
    }
}
