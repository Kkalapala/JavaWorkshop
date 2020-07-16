package ChapterEleven;

import java.io.IOException;

public class example112 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec("firefox");
        } catch (IOException ioe) {
            System.out.println("WARNING: something happened with exec");
        }
    }
}
