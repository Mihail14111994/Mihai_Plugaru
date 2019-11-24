package write;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelClass {

    FileChannel channel;
    RandomAccessFile raf;
    ByteBuffer bb;
    String path;

    public FileChannelClass(String path) {
        this.path = path;
    }

    public void writeFile(String st) throws IOException {
        raf = new RandomAccessFile(path,"rw");
        channel = raf.getChannel();
        byte[] strBytes= st.getBytes();
        bb = ByteBuffer.allocate(strBytes.length);
        bb.put(strBytes);
        bb.flip();
        channel.write(bb);
        raf.close();
        channel.close();
    }
}
