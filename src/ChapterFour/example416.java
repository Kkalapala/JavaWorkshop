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
    }
}
