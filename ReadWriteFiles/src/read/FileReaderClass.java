package read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    FileReader fr ;

    public FileReaderClass(String path) throws FileNotFoundException {
        this.fr = new FileReader(path);
    }

    public  void readFromFile() throws IOException {
        int i;
        while ((i=fr.read())!= -1){
            System.out.print((char) i);
        }
    }
}
