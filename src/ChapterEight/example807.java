package ChapterEight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class example807 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javatemp/";

        Path pathDirectory = Paths.get(pathString);

        if(Files.exists(pathDirectory)) {
            System.out.println("WARNING: directory exists already at: " +
                    pathString);
        } else {
            try {
                //create directory
                Files.createDirectories(pathDirectory);
                System.out.println("New Directory created at: " + pathString);
            } catch (IOException ioe) {
                System.out.println("Could not create the directory");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }

        String fileName = "temp.txt";
        Path pathFile = Paths.get(pathString + fileName);

        if (Files.exists(pathFile)) {
            System.out.println("WARNING: file exists already at: " +
                    pathFile);
        } else {
            try {
                //create file
                Files.createFile(pathFile);
                System.out.println("New file created at: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("Could not create the file");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }
    }
}
