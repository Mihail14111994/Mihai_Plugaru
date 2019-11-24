package read;

import java.io.*;

public class BufferedReaderClass {
    BufferedReader in;

    public BufferedReaderClass(String path) throws FileNotFoundException {
        File file = new File(path);
        this.in = new BufferedReader(new FileReader(file));
    }

    public void readFromFile() throws IOException {
        String fileLine;
        while ((fileLine = in.readLine()) != null)
            System.out.println(fileLine);
    }
}
