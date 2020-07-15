package ChapterEight;

import java.io.IOException;
import java.nio.file.*;

public class example811 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javatemp/temp.txt";
        Path pathFile = Paths.get(pathString);

        try {
            Files.lines(pathFile).forEach(System.out::println);
        } catch (IOException ioe) {
            System.out.println("WARNING: There was an issue with the file.");
        }
    }
}
