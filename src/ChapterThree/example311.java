package ChapterThree;

//recursion for factorial of a number

public class example311 {

    //function to find factorial of a number
    public static long fact (int n) {
        //base condition
        if (n == 1) return 1;
        //call parameter until it reaches base condition
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        String number = "5";
        int input = Integer.parseInt(number);
        long factorial = fact (input);
        System.out.println(factorial);
    }
}
