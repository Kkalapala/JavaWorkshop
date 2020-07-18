package ChapterFifteen.StreamOperations;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {

        Stream.of(1, 2, 2, 2, 2, 3)
                .distinct()
                .forEach(
                        (i) -> {
                            System.out.print(i);
                        }
                );

    }
}
