package ChapterTwo;

// to check if speed of vehicle is above speed limit

public class example203 {
    public static void main(String[] args) {
        // in miles per hour
        int speed = 75;
        int maxSpeed = 65;
        int speedForFine = 70;

        //nested if-else statements
        if (speed <= maxSpeed) {
            System.out.println("Speed is less than or equal to max speed limit.");

            if (speed < maxSpeed) {
                System.out.println("Speed is less than max speed limit.");
            }
        } else if (speed > maxSpeed) {
            System.out.println("Speed is over the max speed limit");
            if (speed > speedForFine) {
                System.out.println("You have to pay fine.");
            }
        }
    }
}
