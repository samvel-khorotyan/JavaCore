package fileSearch;

import java.util.Scanner;

public class FileUtil {

    static Scanner scanner = new Scanner(System.in);

    static FileUtilMethods fileUtilMethods = new FileUtilMethods();

    public static void main(String[] args) {

        System.out.println("PLEASE INPUT TXT PATH");
        String txtPath = scanner.nextLine();
        System.out.println("PLEASE INPUT KEYWORD");
        String keyword = scanner.nextLine();

        fileUtilMethods.findLines(txtPath, keyword);

        System.out.println();
        System.out.println("PLEASE INPUT PACKAGE PATH");
        String path = scanner.nextLine();

        fileUtilMethods.printSizeOfPackage(path);

        System.out.println("PLEASE INPUT PACKAGE PATH");
        String path2 = scanner.nextLine();
        System.out.println("PLEASE INPUT FILE NAME");
        String filename = scanner.nextLine();
        System.out.println("PLEASE INPUT CONTENT");
        String content = scanner.nextLine();

        fileUtilMethods.createFileWithContent(path2,filename,content);
    }
}
