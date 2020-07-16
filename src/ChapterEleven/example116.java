package ChapterEleven;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class example116 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("java -cp ../../../../example115/out/production/example115; example115");
        } catch (IOException ioe) {
            System.out.println("WARNING: Couldn't start your app");
        }

        try {
            process.waitFor(5, TimeUnit.SECONDS);
        } catch (InterruptedException ie) {
            System.out.println("WARNING: interruption exception fired");
        }

        OutputStream out = process.getOutputStream();
        Writer writer = new OutputStreamWriter(out);
        writer.write("This is how we roll.\n");
        writer.flush();

        process.destroy();
    }
}
