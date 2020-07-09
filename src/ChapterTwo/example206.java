package ChapterTwo;

// check minimum height requirement for roller coaster
public class example206 {
    public static void main(String[] args) {
        //in cm
        int height = 200;
        int minHeight = 121;
        String result;

        //ternary operator
        result = (height > minHeight) ? "You are allowed on the ride." :
                "Sorry you do not meet the height requirement";

        System.out.println(result);
    }
}
