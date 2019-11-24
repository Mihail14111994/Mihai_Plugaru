package write;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.*;

public class BufferedWriterClass {

    BufferedWriter br;
    FileWriter fr;
    String path;

    public BufferedWriterClass(String path) {
        this.path = path;
        fr = null;
        br = null;
    }

    public void writeFile(String st){
        File file = new File(path);
//        String newLines = st + System.getProperty(LineSeparator)
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            br.write(st);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
