package ChapterTwo;

//switch cases example 2: temperature adjustment for porridge

public class example210 {
    public static void main(String[] args) {
        int tempAdjustment = 0;
        String taste = "way too hot";

        //switch statements
        switch (taste) {
            case "too cold" : tempAdjustment += 1;
               break;
            case "way too hot" : tempAdjustment -= 1;
            case "too hot" : tempAdjustment -= 1;
            break;
            case "just right" : //no adjustment
            default:
                break;
        }

        System.out.println("Adjust temperature : " + tempAdjustment);
    }
}
