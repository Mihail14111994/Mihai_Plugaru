package read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAsStringNIO {
    String path;
    String str;

    public ReadAsStringNIO(String path) {
        this.path = path;
        str = "";
    }

    public void readFromFile() throws IOException {
        str = new String(Files.readAllBytes(Paths.get(path)));
        System.out.println(str);
    }
}
