package read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class StringListNIO {

    List<String> list;
    String path;

    public StringListNIO(String path) {
        this.path = path;
        this.list = Collections.emptyList();
    }

    public void readFromFile(){
        try{
            list = Files.readAllLines(Paths.get(path));
        } catch (IOException e){
            e.printStackTrace();
        }
        for (String i :list) {
            System.out.println(i);
        }
    }
}
