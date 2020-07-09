package ChapterTwo;

// using comparison operators to know if online retail store will deliver goods home for free

public class example202 {
    public static void main(String[] args) {
        // in km
        int maxDistance = 10;
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("Distance from the store to your home is ");
            System.out.println("more than " + maxDistance + " km.");
            System.out.println("That is too far away for free delivery.");
        }

        if (distanceToHome <= maxDistance) {
            System.out.println("Distance from the store to your home is ");
            System.out.println(" within " + maxDistance + " km.");
            System.out.println("You get free delivery.");
        }
    }
}
