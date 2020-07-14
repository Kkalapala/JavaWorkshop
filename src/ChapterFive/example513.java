package ChapterFive;

import java.nio.file.*;
import java.util.logging.*;

public class example513 {
    public static void issuePointerException() throws NullPointerException {
        throw new NullPointerException("Exception: Null Pointer");
    }

    public static void issueFileException() throws NoSuchFileException {
        throw new NoSuchFileException("Exception: File Not Found");
    }

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        int exceptionNum = Integer.valueOf(2);
        switch (exceptionNum) {
            case 1:
                try {
                    issuePointerException();
                } catch (NullPointerException ne) {
                    logger.log(Level.SEVERE, "Exception happened", ne);
                }
                break;
            case 2:
                try {
                    issueFileException();
                } catch (NoSuchFileException ne) {
                    logger.log(Level.WARNING, "Exception happened", ne);
                }
                break;
            case 3:
                try {
                    issueFileException();
                } catch (NoSuchFileException ne) {
                    logger.log(Level.INFO, "Exception happened", ne);
                }
                break;
        }
    }
}
