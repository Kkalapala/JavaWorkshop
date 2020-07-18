package ChapterFifteen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class example151 {
    public static void main(String[] args) {
        ShoppingCart1 fruitCart = new ShoppingCart1(new ArrayList<ShoppingArticle>() {{
            add(new ShoppingArticle("Orange", 1.5));
            add(new ShoppingArticle("Apple", 1.7));
            add(new ShoppingArticle("Banana", 2.2));
        }});

        ShoppingCart1 vegetableCart = new ShoppingCart1(new ArrayList<ShoppingArticle>() {{
            add(new ShoppingArticle("Cucumber", 0.8));
            add(new ShoppingArticle("Salad", 1.2));
            add(new ShoppingArticle("Tomatoes", 2.7));
        }});

        ShoppingCart1 meatAndFishCart = new ShoppingCart1(new ArrayList<ShoppingArticle>() {{
            add(new ShoppingArticle("Cod", 46.5));
            add(new ShoppingArticle("Beef", 29.1));
            add(new ShoppingArticle("Salmon", 35.2));
        }});

        double sum = calculatePrice(fruitCart, vegetableCart, meatAndFishCart);
        System.out.println(String.format("Sum: %.2f", sum));
    }

    private static double calculatePrice(ShoppingCart1... carts) {
        return Stream.of(carts)
                .flatMap((cart) -> { return cart.mArticles.stream(); })
                .mapToDouble((item) -> { return item.price; })
                .sum();
    }

    private static final class ShoppingCart1 {
        final List<ShoppingArticle> mArticles = new ArrayList<>();

        public ShoppingCart1(List<ShoppingArticle> list) {
            mArticles.addAll(list);
        }
    }

    private static final class ShoppingArticle {
        final String name;
        final double price;

        public ShoppingArticle(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}
