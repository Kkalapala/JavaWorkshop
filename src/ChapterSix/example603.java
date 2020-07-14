package ChapterSix;

import java.time.*;

public class example603 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DayOfWeek day = localDateTime.getDayOfWeek();

        System.out.println("The weekday is: " + day);
    }
}
