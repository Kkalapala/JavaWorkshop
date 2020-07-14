package ChapterSix;

public class example602 {
    public static void main(String[] args) {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();

        java.time.DayOfWeek day = localDateTime.getDayOfWeek();

        System.out.println("The weekday is: " + day);
    }
}
