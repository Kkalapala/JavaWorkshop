package ChapterFour;

import java.util.*;

public class example421 {
    public static void main(String[] args) {
        List<Double> array = new ArrayList();
        array.add(5.0);
        array.add(2.2);
        array.add(37.5);
        array.add(3.1);
        array.add(1.3);

        System.out.println("Original List : " + array);

        Collections.sort(array);

        System.out.println("Modified List : " + array);
    }
}
