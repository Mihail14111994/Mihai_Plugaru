package write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    FileWriter fr;
    String path;

    public FileWriterClass(String path) {
        this.path = path;
        fr = null;
    }

    public void writeFile(String st) {
        File file = new File(path);
        try{
            fr = new FileWriter(file);
            fr.write(st);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
