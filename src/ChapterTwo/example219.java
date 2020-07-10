package ChapterTwo;

public class example219 {
    public static void main(String[] args) {

        String [] pressure = {"100","70"};

        if (pressure.length < 2) {
            System.err.println("Error. usage is");
            System.err.println("example systolic diastolic");
            System.exit(-1);
        }

        int systolic = Integer.parseInt(pressure[0]);
        int diastolic = Integer.parseInt(pressure[1]);

        System.out.println(systolic + "/" + diastolic + " is ");

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
