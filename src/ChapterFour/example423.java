package ChapterFour;

import java.util.*;

public class example423 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("OS", "Ubuntu Linux");
        properties.put("version", "18.04");
        properties.put("language", "English(UK)");

        properties.list(System.out);
    }
}
