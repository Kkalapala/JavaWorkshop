package ChapterTwentyOne;

import java.lang.ref.SoftReference;

public class example27 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        SoftReference<ShoppingCart> softReference = new SoftReference<>(shoppingCart);

        shoppingCart = null;

        System.gc();

        System.runFinalization();

        ShoppingCart shoppingCart2 = softReference.get();

        System.out.println(String.format("ShoppingCart was %scleared.",
                (shoppingCart2 == null ? "" : "not ")));

    }
}
