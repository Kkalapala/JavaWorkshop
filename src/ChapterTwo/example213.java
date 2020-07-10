package ChapterTwo;

//jump out of loop using break or jump to the next iteration using continue

public class example213 {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D"};

        //for loop
        for (String letter : letters) {
            //jumping to next iteration
            if (letter.equals("A")) {
                continue;
            }
            System.out.println(letter);
            //jumping out of loop
            if (letter.equals("C")) {
                break;
            }
        }
    }
}
