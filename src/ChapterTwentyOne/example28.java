package ChapterTwentyOne;

import java.lang.ref.SoftReference;

public class example28 {
    public static void main(String[] args) throws InterruptedException {
        ShoppingCart shoppingCart = new ShoppingCart();

        SoftReference<ShoppingCart> softReference = new SoftReference<>(shoppingCart);

//        // Also set the maximum heap size using VM option -XmX2M (maximum heap to 2MB)
//        for (int i = 0; i < 1_000_000; i++) {
//            ShoppingCart shoppingCart1 = new ShoppingCart();
//        }


        shoppingCart = null;

        ShoppingCart shoppingCart2 = softReference.get();

        System.gc();

        System.runFinalization();

        System.out.println(String.format("ShoppingCart was %scleared.",
                (shoppingCart2 == null ? "" : "not ")));
    }
}
