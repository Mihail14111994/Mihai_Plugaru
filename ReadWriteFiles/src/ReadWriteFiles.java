import write.*;

import java.io.IOException;

public class ReadWriteFiles {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\mplugaru\\Desktop\\Mihai_Plugaru   GIT\\ReadWriteFiles\\src\\TestFile_Write";
        String str = "C:\\Users\\mplugaru\\Desktop\\Mihai_Plugaru   GIT\\ReadWriteFiles\\src\\TestFile_ReadWrite";
//
//        read.BufferedReaderClass a = new read.BufferedReaderClass(path);
//        a.readFromFile();
//
//        read.FileReaderClass b = new read.FileReaderClass(path);
//        b.readFromFile();
//
//        read.ScannerClass c = new read.ScannerClass(path);
//        c.readFromFile();
//
//        read.StringListNIO d = new read.StringListNIO(path);
//        d.readFromFile();
//
//        ReadAsStringNIO e = new ReadAsStringNIO(path);
//        e.readFromFile();
//
//        OutputStreamsClass z = new OutputStreamsClass(path);
//        z.writeFile(str);
//
//        FilesWriteClass x = new FilesWriteClass(path);
//        x.writeFile(str);
//
//        BufferedWriterClass y = new BufferedWriterClass(path);
//        y.writeFile(str);

//        FileWriterClass q = new FileWriterClass(path);
//        q.writeFile(str);

        FileChannelClass w = new FileChannelClass(path);
        w.writeFile(str);
    }
}
