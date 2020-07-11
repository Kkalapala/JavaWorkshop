package ChapterFour;

import java.util.Arrays;

public class example404 {
    public static void main(String[] args) {
        String[] text = {"love", "is", "in", "the", "air"};

        Arrays.sort(text);

        int search = Arrays.binarySearch(text, "is");
        System.out.println(search);
    }
}
