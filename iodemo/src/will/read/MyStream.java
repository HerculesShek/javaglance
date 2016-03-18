package will.read;

import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义输入流
 */
class MyByteArrayInputStream extends InputStream {
    protected byte[] data;
    protected int ptr = 0;

    public MyByteArrayInputStream(byte[] d) {
        data = d;
    }

    @Override
    public int read() throws IOException {
        return (ptr < data.length) ? data[ptr++] : -1;
    }
}

public class MyStream {
    public static void main(String[] args) throws IOException {
        byte[] b = "hello will".getBytes();
        MyByteArrayInputStream inputStream = new MyByteArrayInputStream(b);
        int c;
        while ((c = inputStream.read()) != -1) {
            System.out.print((char) c);
        }
        inputStream.close();


    }
}
