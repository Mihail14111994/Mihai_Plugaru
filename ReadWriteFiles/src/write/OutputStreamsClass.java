package write;

import java.io.*;

public class OutputStreamsClass {

    OutputStream os = null;
    String path;

    public OutputStreamsClass(String path) {
        this.path = path;
    }

    public void writeFile(String st) throws IOException {
        try {
            os = new FileOutputStream(new File(path));
            os.write(st.getBytes(), 0, st.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            os.close();
        }
    }
}
