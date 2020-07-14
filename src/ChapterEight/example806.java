package ChapterEight;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.*;

public class example806 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("user.home");
        Path path = Paths.get(pathString);

//        To get dir and subdir names:
//        method 1
//        Stream<Path> fileNames = Files.list(path).filter(Files::isDirectory);
//        fileNames.limit(5).forEach((item) -> {
//            System.out.println(item.toString());
//            try {
//                Stream<Path> fileNames2 = Files.list(item).
//                        filter(Files::isDirectory);
//                fileNames2.forEach(System.out::println);
//            } catch (IOException ioe) {}
//        });

//        method 2
        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
