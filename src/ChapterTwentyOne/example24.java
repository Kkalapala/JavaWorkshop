package ChapterTwentyOne;

import java.util.WeakHashMap;

public class example24 {
    public static void main(String[] args) {
        Student harry = new Student("Harry");
        Student jenny = new Student("Jenny");

        WeakHashMap<Student, Integer> testResults = new WeakHashMap<>();
        testResults.put(harry, 23);
        testResults.put(jenny, 25);

        System.out.println("Test results: " + testResults.size());

        harry = null;

        System.gc();

        System.runFinalization();

        System.out.println("Test results: " + testResults.size());
    }
}


