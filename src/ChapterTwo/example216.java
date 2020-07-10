package ChapterTwo;

// run from command line

public class example216 {
    public static void main(String[] args) {
        String[] numbers = {"42", "65.8"};

        // convert to integer value
        if (numbers.length > 0) {
            int intValue = Integer.parseInt(numbers[0]);
            System.out.println(intValue);
        }

        // convert to double value
        if (numbers.length > 1) {
            double doubleValue = Double.parseDouble(numbers[1]);
            System.out.println(doubleValue);
        }
    }
}
