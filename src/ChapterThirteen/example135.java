package ChapterThirteen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class example135 {
    public static void main(String[] args) {
        List<Tire> tires = new ArrayList<>();
        tires.add(new Tire(17));
        tires.add(new Tire(16));
        tires.add(new Tire(18));
        tires.add(new Tire(14));
        tires.add(new Tire(15));
        tires.add(new Tire(16));

        Comparator<Tire> sorter = (t1, t2) -> t2.size - t1.size;

        List<Tire> sorted = new ArrayList<>(tires);
        sorted.sort(sorter);

        System.out.println(sorted);
    }

    public static final class Tire {
        private final int size;
        public Tire(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return String.valueOf(size);
        }
    }
}
