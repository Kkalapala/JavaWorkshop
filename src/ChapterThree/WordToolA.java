package ChapterThree;

/**
 * <H1>WordToolA</H1>
 *
 * a class to perform calculations about text
 *
 * @author Kavya
 * @version 0.1
 * @since 20200711
 */

public class WordToolA {
    //constructor
    WordToolA () {}

    /**
     * <h2>wordCount</h2>
     *returns the amount of words in a text, takes a string as parameter
     *
     * @param s
     * @return int
     */
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

    /**
     * <h2>symbolCount</h2>
     * returns the amount of symbols in a string with or without counting spaces
     *
     * @param s
     * @param withSpaces
     * @return int
     */
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

    /**
     * <h2>getFrequency</h2>
     * the amount of occurrences of a symbol in a string
     *
     * @param s
     * @param c
     * @return int
     */
    public int getFrequency ( String s, char c) {
        int count = 0;

        //if entry is empty or null, count is 0
        if ( !(s == null || s.isEmpty()) ) {
            count = s.length() - s.replace(Character.toString(c), "").length();
        }
        return count;
    }

    /**
     * <h2>main</h2>
     * uses an example string to demonstrate how the class works
     *
     * @param args
     */
    public static void main(String[] args) {
        WordToolA wt = new WordToolA ();

        String text = "The river carried the memories from her childhood.";
        char search = 'e';

        //results
        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wt.wordCount(text) );
        System.out.println( "Total symbols (w. spaces): " + wt.symbolCount(text, true) );
        System.out.println( "Total symbols (wo. spaces) " + wt.symbolCount(text, false) );
        System.out.println( "Total amount of " + search + ": " + wt.getFrequency(text, search));
    }
}
