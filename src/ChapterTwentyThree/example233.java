package ChapterTwentyThree;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class MergeSort extends RecursiveTask<int[]> {
    private int[] data;

    public MergeSort(int ...values) {
        this.data = values;
    }

    @Override
    protected int[] compute() {
        if (data.length == 1) {
            return data;
        }
        int middle = data.length / 2;
        int[] left = Arrays.copyOfRange(data, 0, middle);
        int[] right = Arrays.copyOfRange(data, middle, data.length);

        MergeSort leftTask = new MergeSort(left);
        MergeSort rightTask = new MergeSort(right);

        invokeAll(leftTask, rightTask);

        int[] leftResult = leftTask.join();
        int[] rightResult = rightTask.join();

        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int l = 0, r = 0;
        for(int i = 0; i < result.length; i++) {
            if (l >= left.length) {
                result[i] = right[r++];
            } else if (r >= right.length) {
                result[i] = left[l++];
            } else if (left[l] < right[r]) {
                result[i] = left[l++];
            } else {
                result[i] = right[r++];
            }
        }

        return result;
    }
}

public class example233 {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        int[] result = forkJoinPool.invoke(new MergeSort(1, 4, 7, 3, 5, 9,
                12, 54, 32, 3, 2, 87, 24));

        System.out.println(Arrays.toString(result));
    }
}
