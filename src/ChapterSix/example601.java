package ChapterSix;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class example601 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DayOfWeek day = localDateTime.getDayOfWeek();

        System.out.println("The weekday is: " + day);
    }
}
