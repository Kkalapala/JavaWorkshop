package ChapterTwo;

//check blood pressure

public class example219 {
    public static void main(String[] args) {

        String [] pressure = {"100","70"};

        //checking if there are correct number of inputs
        if (pressure.length < 2) {
            System.err.println("Error. usage is");
            System.err.println("example systolic diastolic");
            System.exit(-1);
        }

        //converting string values to integer values
        int systolic = Integer.parseInt(pressure[0]);
        int diastolic = Integer.parseInt(pressure[1]);

        System.out.println(systolic + "/" + diastolic + " is ");

        //compare values to ideal range
        if ((systolic <= 90) || (diastolic <= 60)) {
            System.out.println("low blood pressure");
        } else if ((systolic >= 140) || (diastolic >= 90)) {
            System.out.println("high blood pressure");
        } else if ((systolic >= 120) || (diastolic >= 80)) {
            System.out.println("pre-high blood pressure");
        } else {
            System.out.println("Ideal blood pressure");
        }
    }
}
