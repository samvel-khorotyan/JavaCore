package fileSearch;

import java.io.File;
import java.util.Scanner;

public class FileSearch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PLEASE INPUT PATH");
        String path = scanner.nextLine();
        System.out.println("PLEASE INPUT FILE NAME");
        String fileName = scanner.nextLine();

        File file = new File(path);

        File[] files = file.listFiles();

        boolean bool = false;

        for (File file1 : files) {
            if (file1.exists() && file1.getName().equals(fileName)) {
                bool = true;
            }
        }
        System.out.println(bool);
    }
}

