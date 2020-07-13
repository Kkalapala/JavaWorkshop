package ChapterFour;

import java.io.Console;
import java.util.*;

public class example416 {
    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList<String>();
        Console cons;
        String line = "";

        while (!line.equals("*")
                && (cons = System.console()) != null
                && (line = cons.readLine()) != null) {
            List <String> lineList = new ArrayList<String>(Arrays.asList(line.split(" ")));
            text.add(line);
        }
        System.out.println("You typed" + line);
        System.out.println("Word count: " + text.size());

        Set <String> textSet = new HashSet<String>();
        textSet.addAll(text);

        Iterator iterator = textSet.iterator();

        while (iterator.hasNext()) {
            //point to next element
            String s = (String) iterator.next();

            //get the amount of times this word shows up in text
            int freq = Collections.frequency(text, s);

            //print out the results
            System.out.println(s + " appears " + freq + " times");
        }
    }
}
