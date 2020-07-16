package ChapterEleven;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class example117 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec(
                    "java -cp ../../../../example115/out/production/example115; example115");
        } catch (IOException ioe) {
            System.out.println("WARNING: couldn't start your app");
        }

        try {
            process.waitFor(5, TimeUnit.SECONDS);
        } catch (InterruptedException ie) {
            System.out.println("WARNING: interruption exception fired");
        }

        //write to the child's System in
        OutputStream out = process.getOutputStream();
        Writer writer = new OutputStreamWriter(out);
        writer.write("This is how we roll.\n");
        writer.flush();

        //prepare the data logger
        File file = new File("data.log");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //read from System.out from the child
        InputStream in = process.getInputStream();
        Reader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();

        //send to screen
        System.out.println(line);

        //send to file
        bufferedWriter.write(line);
        bufferedWriter.flush();

        process.destroy();
    }
}
