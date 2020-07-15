package ChapterEight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class example814 {
    public static void main(String[] args) throws IOException {

        BufferedReader inStream = null;

        try {
            FileReader fileReader = new FileReader(System.getProperty("user.home") + "/javatemp/temp.txt");
            inStream = new BufferedReader(fileReader);
            String line;

            while ((line = inStream.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (inStream != null) {
                inStream.close();
            }
        }
    }
}
