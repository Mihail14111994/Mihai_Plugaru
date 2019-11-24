package write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWriteClass {

    String path;

    public FilesWriteClass(String path) {
        this.path = path;
    }

    public void writeFile(String st){
        try{
            Files.write(Paths.get(path), st.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
