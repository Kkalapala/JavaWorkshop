package ChapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example153 {
    public static void main(String[] args) {
        try {
            List<ShoppingArticle2> database = loadDatabaseFile();

            System.out.println(database);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<ShoppingArticle2> loadDatabaseFile() throws IOException {
        Path path = Paths.get("C:/Users/Kavya/IdeaProjects/JavaWorkshop/res/database.csv");

        try (Stream<String> stream = Files.lines(path)) {
            stream.peek((line) -> {
                System.out.println(line);
            }).skip(1).map((line) -> {
                return line.split(",");
            }).peek((s) -> {
                System.out.println(s);
            }).map((arr) -> {
                return new ShoppingArticle2(
                        arr[0],
                        arr[1],
                        Double.valueOf(arr[2]),
                        arr[3]
                );
            }).peek((art) -> {
                System.out.println(art);
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static class ShoppingArticle2 {
        final String name;
        final String category;
        final double price;
        final String unit;

        private ShoppingArticle2(String name, String category, double price, String unit) {
            this.name = name;
            this.category = category;
            this.price = price;
            this.unit = unit;
        }

        @Override
        public String toString() {
            return name + " (" + category + ")";
        }
    }
}




