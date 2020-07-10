package ChapterTwo;

//using local variable type inference

public class example218 {
    public static void main(String[] args) {

        //java 8 does not support var as local variable
        String s = new String("Hello");
        System.out.println("The value is : " + s);

        int i = Integer.valueOf("42");
        System.out.println("The value is : " + i);
    }

}
