package ChapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example154 {
    public static void main(String[] args) {
        try {
            List<ShoppingArticle3> database = loadDatabaseFile();

            System.out.println(database);
            
            System.out.println("Cheapest fruit: " + findCheapestFruit(database));

            System.out.println("Most expensive vegetable: " + findMostExpensiveVegetable(database));

            System.out.println("Fruits: " + findFruits(database));

            System.out.println("Five most expensive articles: " + findFiveMostExpensive(database));

            System.out.println("Five cheapest articles: " + findFiveCheapest(database));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<ShoppingArticle3> loadDatabaseFile() throws IOException {
        Path path = Paths.get("C:/Users/Kavya/IdeaProjects/JavaWorkshop/res/database.csv");

        try (Stream<String> stream = Files.lines(path)) {
            stream.peek((line) -> {
                System.out.println(line);
            }).skip(1).map((line) -> {
                return line.split(",");
            }).peek((s) -> {
                System.out.println(s);
            }).map((arr) -> {
                return new ShoppingArticle3(
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

    private static class ShoppingArticle3 {
        final String name;
        final String category;
        final double price;
        final String unit;

        private ShoppingArticle3(String name, String category, double price, String unit) {
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

    private static ShoppingArticle3 findCheapestFruit (List<ShoppingArticle3> articles) {
        return articles.stream()
                .filter((article) -> article.category.equals("Fruits"))
                .min(Comparator.comparingDouble(article -> article.price))
                .orElse(null);
    }

    private static ShoppingArticle3 findMostExpensiveVegetable (List<ShoppingArticle3> articles) {
        return articles.stream()
                .filter((article) -> article.category.equals("Vegetables"))
                .max(Comparator.comparingDouble(article -> article.price))
                .orElse(null);
    }

    private static List<ShoppingArticle3> findFruits (List<ShoppingArticle3> articles) {
        return articles.stream()
                .filter((article) -> article.category.equals("Fruits"))
                .collect(Collectors.toList());
    }

    private static List<ShoppingArticle3> findFiveCheapest (List<ShoppingArticle3> articles) {
        return articles.stream()
                .sorted(Comparator.comparingDouble(article -> article.price))
                .limit(5)
                .collect(Collectors.toList());
    }

    private static List<ShoppingArticle3> findFiveMostExpensive (List<ShoppingArticle3> articles) {
        return articles.stream()
                .sorted((article1, article2) -> Double.compare(article2.price, article1.price))
                .limit(5)
                .collect(Collectors.toList());
    }
}
