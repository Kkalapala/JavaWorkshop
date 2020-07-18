package ChapterFifteen;

import java.util.OptionalDouble;
import java.util.stream.*;

public class Average {
    public static void main(String[] args) {
        OptionalDouble avg1 = IntStream.of(6, 3, 8, 12, 3, 9).average();
        System.out.println(avg1);

        OptionalDouble avg2 = LongStream.of(6, 3, 8, 12, 3, 9).average();
        System.out.println(avg2);

        OptionalDouble avg3 = DoubleStream.of(6, 3, 8, 12, 3, 9).average();
        System.out.println(avg3);
    }
}
