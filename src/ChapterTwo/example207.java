package ChapterTwo;

//compare decimal values

public class example207 {
    public static void main(String[] args) {
        double a = .6 + .6 + .6 + .6 + .6 +.6;
        double b = .6 * 6;

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);

        //check values
        if (a != b) {
            System.out.println("A is not equal to B.");
        }
        //check if close enough
        if(Math.abs(a-b) < .001) {
            System.out.println("A is close enough to B.");
        }
    }
}
