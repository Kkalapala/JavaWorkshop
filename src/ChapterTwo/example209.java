package ChapterTwo;

//switch cases example: mapping a number to a season

public class example209 {
    public static void main(String[] args) {
        int season = 3;
        String message;

        //switch statements
        switch(season) {
            case 1: message = "Spring";
            break;
            case 2: message = "Summer";
            break;
            case 3: message = "Fall";
            break;
            case 4: message = "Winter";
            break;
            default: message = "That is not a season.";
            break;
        }

        System.out.println(message);
    }
}
