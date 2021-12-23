package fileSearch;

import java.io.File;
import java.util.Scanner;

public class FileSearch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PLEASE INPUT PATH");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("PATH DOES NOT EXISTS OR IS NOT DIRECTORY");
        } else {
            System.out.println("PLEASE INPUT FILE NAME");
            String fileName = scanner.nextLine();
            findFile(path, fileName);
        }
    }

    static void findFile(File parent, String fileName) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, fileName);
            } else {
                if (file.getName().contains(fileName)) {
                    System.out.println(file.getAbsolutePath());
                    break;
                }
            }
        }
    }
}

