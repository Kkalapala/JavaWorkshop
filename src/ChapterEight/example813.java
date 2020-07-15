package ChapterEight;

import java.io.IOException;
import java.io.FileInputStream;

public class example813 {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;

        try {
            inStream = new FileInputStream(System.getProperty("user.home") + "/javatemp/temp.txt");
            int c;

            while ((c = inStream.read()) != -1) {
                System.out.print(c);
            }
        } finally {
            if (inStream != null) {
                inStream.close();
            }
        }
    }
}
