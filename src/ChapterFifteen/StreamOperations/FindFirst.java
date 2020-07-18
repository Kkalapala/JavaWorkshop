package ChapterFifteen.StreamOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {

        Optional firstElement = Stream.of().findFirst();
        System.out.println(firstElement);

    }
}
