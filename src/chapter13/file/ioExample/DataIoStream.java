package chapter13.file.ioExample;

import java.io.*;

public class DataIoStream {

    private static final String FILE_PATH = "C:\\Users\\User\\Screenshot\\text.txt\\";

    public static void main(String[] args) throws IOException {

        write();
        read();

    }

    private static void write() throws IOException {
       DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
       out.writeInt(33);
       out.writeBoolean(false);
       out.close();
    }

    private static void read() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());
        dataInputStream.close();
    }
}
