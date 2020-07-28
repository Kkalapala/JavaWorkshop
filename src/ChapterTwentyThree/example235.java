package ChapterTwentyThree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example235 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String filePath = System.getProperty("user.dir") +
                File.separator + "res/database.csv";

        List<Member> members = parseMembers(filePath);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        long bubbleSortStart = System.nanoTime();

        Future<List<Member>> bubbleResult =
                executorService.submit(new BubbleSortMember(members));

        try {
            bubbleResult.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Duration bubbleSortDuration =
                Duration.of(System.nanoTime() - bubbleSortStart, ChronoUnit.NANOS);
        System.out.println(String.format("BubbleSort: %02dm:%02ds:%02dms",
                bubbleSortDuration.toMinutes(),
                bubbleSortDuration.getSeconds(),
                bubbleSortDuration.toMillis()));

        executorService.shutdown();

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        long mergeSortStart = System.nanoTime();

        List<Member> mergeSort = forkJoinPool.invoke(new MergeSortMember(members));

        Duration mergeSortDuration = Duration.of(System.nanoTime() -
                mergeSortStart, ChronoUnit.NANOS);
        System.out.println(String.format("MergeSort: %02dm:%02ds:%02dms",
                mergeSortDuration.toMinutes(),
                mergeSortDuration.getSeconds(),
                mergeSortDuration.toMillis()));
    }

    private static List<Member> parseMembers(String filePath) {
        try (Stream<String> authors = Files.lines(Paths.get(filePath))) {
            return authors.skip(1).map(Member::new).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
