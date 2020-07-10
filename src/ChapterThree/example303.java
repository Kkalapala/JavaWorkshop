package ChapterThree;

/**
 *checkNumber method: can discriminate between different types of variables
 *and print different messages based on that.
 */

public class example303 {

    public static void checkNumber(Number val) {
        if (val instanceof Integer) {
            System.out.println("It is an Integer");
        }
        if (val instanceof Double) {
            System.out.println("It is a Double");
        }
    }

    public static void main(String[] args) {
        int val1 = 3;
        double val2 = 2.7;

        checkNumber(val1);
        checkNumber(val2);
    }
}
