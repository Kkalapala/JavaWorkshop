package ChapterOne;

//check minimum of two numbers

public class example08 {
    public static void main(String[] args) {
        //declare double variables and initializing
        double a = 3;
        double b = 4;
        double m;

        //string variable
        String r = "The minimum of two numbers is: ";

        //minimum of two numbers
        m = Math.min(a,b);

        //results
        System.out.println(r + m);
    }
}
