package ChapterFour;

import java.util.*;

public class example406 {
    public static void main(String[] args) {
        String[] text = {"So", "many", "books", "so", "little", "time"};
        String searchQuery = "so";

        int occurence = -1;

        for (int i = 0; i < text.length; i++) {
            occurence = text[i].compareToIgnoreCase(searchQuery);
            if (occurence == 0) {
                System.out.println("Found query at: " + i);
            }
        }

    }
}
