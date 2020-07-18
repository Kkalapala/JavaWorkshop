package ChapterFifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class example152 extends example151 {
    public static void main(String[] args) {
        ShoppingCart2 fruitCart = new ShoppingCart2(new ArrayList<ShoppingArticle1>() {{
            add(new ShoppingArticle1("Orange", 1.5));
            add(new ShoppingArticle1("Apple", 1.7));
            add(new ShoppingArticle1("Banana", 2.2));
        }});

        ShoppingCart2 vegetableCart = new ShoppingCart2(new ArrayList<ShoppingArticle1>() {{
            add(new ShoppingArticle1("Cucumber", 0.8));
            add(new ShoppingArticle1("Salad", 1.2));
            add(new ShoppingArticle1("Tomatoes", 2.7));
        }});

        ShoppingCart2 meatAndFishCart = new ShoppingCart2(new ArrayList<ShoppingArticle1>() {{
            add(new ShoppingArticle1("Cod", 46.5));
            add(new ShoppingArticle1("Beef", 29.1));
            add(new ShoppingArticle1("Salmon", 35.2));
        }});

        double sum = calculatePrice1(fruitCart, vegetableCart, meatAndFishCart);
        System.out.println(String.format("Sum: %.2f", sum));

        Map<String, Double> discounts = new HashMap<String, Double>() {{
            put("Cod", 0.2);
            put("Salad", 0.5);
            put("Apple", 0.7);
        }};

        double sumDiscount = calculatePriceWithDiscounts(discounts, fruitCart, vegetableCart, meatAndFishCart);
        System.out.println(String.format("Discount sum: %.2f", sumDiscount));
    }

    private static double calculatePrice1(ShoppingCart2... carts) {
        return Stream.of(carts)
                .flatMap((cart) -> { return cart.mArticles.stream(); })
                .mapToDouble((item) -> { return item.price; })
                .sum();
    }

    private static final class ShoppingCart2 {
        final List<ShoppingArticle1> mArticles = new ArrayList<>();

        public ShoppingCart2(List<ShoppingArticle1> list) {
            mArticles.addAll(list);
        }
    }

    private static final class ShoppingArticle1 {
        final String name;
        final double price;

        public ShoppingArticle1(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    private static double calculatePriceWithDiscounts(Map<String, Double> discounts, ShoppingCart2... carts) {
        return Stream.of(carts)
                .flatMap((cart) -> { return cart.mArticles.stream(); })
                .mapToDouble((item) -> {
                    if (discounts.containsKey(item.name)) {
                        return item.price - item.price * discounts.get(item.name);
                    }
                    return item.price;
                })
                .sum();
    }
}
