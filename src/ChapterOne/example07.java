package ChapterOne;

// trigonometry example

public class example07 {
    public static void main(String[] args) {
        //first side of triangle
        double a = 3;
        //second side of triangle
        double b = 4;
        //hypotenuse
        double h;
        double m;

        //calculating hypotenuse - method 1
        m = Math.sqrt(a*a + b*b);
        System.out.println(m);

        //calculating hypotenuse - method 2
        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(h);
    }
}
