package ChapterFive;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class example508 {
    public static void main(String[] args) {
        //declare a list that will contain all your files
        //inside of a readme.txt file
        List<String> lines = Collections.emptyList();

        try {
            //provoke an exception
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException fe) {
            System.out.println("Exception: File Not Found");
        } catch (IOException ioe) {
            System.out.println("Exception: IOException");
        }

        //this print will never be seen
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
