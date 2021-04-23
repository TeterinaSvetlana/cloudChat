package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoUtils {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("15809.jpeg");

        OutputStream os = new FileOutputStream("copy.jpeg");

        byte[] buffer = new byte[256];

        int read;

        int cnt = 0;

        while (true) {
            read = is.read(buffer);
            if (read == -1) {
                break;
            }
//            cnt++;
//            if (cnt > 100) {
//                for (int i = 0; i < read; i++) {
//                    buffer[i] &= 0b00000010;
//                }
//            }
            os.write(buffer, 0, read);
        }
        os.flush();
        os.close();

    }

}
