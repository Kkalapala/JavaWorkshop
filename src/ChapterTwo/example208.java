package ChapterTwo;

//string equals method: comparing two strings

public class example208 {
    public static void main(String[] args) {
        String cat = new String("cat");
        String dog = new String("dog");

        if (cat.equals(dog)) {
            System.out.println("Cats and dogs are the same.");
        } else if (!cat.equals(dog)) {
            System.out.println("Cats and dogs are not the same.");
        }

        if(dog.equals(dog)) {
            System.out.println("Dogs are dogs.");
        }

        //using literal strings
        if (dog.equals("dog")) {
            System.out.println("Dogs are dogs.");
        }

        //can compare using a literal string as well
        if ("dog".equals(dog)) {
            System.out.println("Dogs are dogs.");
        }
    }
}
