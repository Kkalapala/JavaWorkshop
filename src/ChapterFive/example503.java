package ChapterFive;

import java.nio.file.*;
import java.util.*;

public class example503 {
    public static void main(String[] args) {
        //declare a list that will contain all your files
        //inside of a readme.txt file
        List<String> lines = Collections.emptyList();

        //provoke an exception
       // lines = Files.readAllLines(Paths.get("readme.txt")); uncomment this line

        //this print will never be seen
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

