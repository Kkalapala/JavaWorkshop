package ChapterTwentyThree;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BubbleSort implements Runnable {

    private int[] data;

    public BubbleSort(int...values) {
        this.data = values;
    }
    @Override
    public void run() {
        System.out.println(Arrays.toString(data));

        int n = data.length;

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                int currentItem = data[i];
                int nextItem = data[i + 1];

                if (currentItem > nextItem) {
                    data[i] = nextItem;
                    data[i + 1] = currentItem;
                    swapped = true;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}

public class example231 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(new BubbleSort(5, 2, 1, 3, 7, 9, 6, 4, 8, 10));

        service.shutdown();
    }
}
