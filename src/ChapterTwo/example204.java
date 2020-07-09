package ChapterTwo;

// calculating different discounts offered when buying coffee beans

public class example204 {
    public static void main(String[] args) {
        //discount percents
        int noDiscount = 0;
        int mediumDiscount = 10;
        int largeDiscount = 15;

        //coffee bean orders in kg
        int mediumThreshold = 5;
        int largeThreshold = 50;

        int purchaseAmount = 40;

        if (purchaseAmount >= largeThreshold) {
            System.out.println("You get a discount of " + largeDiscount + "%");
        } else if (purchaseAmount >= mediumThreshold) {
            System.out.println("You get a discount of " + mediumDiscount + "%");
        } else {
            System.out.println("You get a discount of " + noDiscount + "%");
        }
    }
}
