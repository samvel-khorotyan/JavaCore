package chapter13.file.file1;

import java.io.File;

public class File1 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Screenshot\\");

        File[] file1 = file.listFiles();
        for (File file2 : file1) {
            System.out.println(file2);
        }
    }
}
