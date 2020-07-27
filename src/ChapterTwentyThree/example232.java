package ChapterTwentyThree;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ImprovedBubbleSort implements Runnable {
    private int[] data;

    public ImprovedBubbleSort(int... values) {
        this.data = values;
    }

    @Override
    public void run() {
        System.out.println(Arrays.toString(data));

        int n = data.length;

        int passes = 0;

        for (int i = 1; i < n; i++) {
            passes++;
            for (int j = 0; j < n - i; j++) {
                int currentItem = data[j];
                int nextItem = data[j + 1];

                if (currentItem > nextItem) {
                    data[j] = nextItem;
                    data[j + 1] = currentItem;
                }
            }
        }
        System.out.println(Arrays.toString(data));

        System.out.println("Passes: " + passes);
    }
}

public class example232 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(new BubbleSort(5, 1, 2, 4, 3, 6));
        service.execute(new ImprovedBubbleSort(5, 1, 2, 4, 3, 6));

        service.execute(new BubbleSort(1, 3, 2, 5, 4, 7));
        service.execute(new ImprovedBubbleSort(1, 3, 2, 5, 4, 7));

        service.shutdown();
    }
}
