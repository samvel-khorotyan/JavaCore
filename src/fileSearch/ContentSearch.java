package fileSearch;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PLEASE INPUT PATH");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("PATH DOES NOT EXISTS OR IS NOT DIRECTORY");
        } else {
            System.out.println("PLEASE INPUT KEYWORD");
            String fileName = scanner.nextLine();
            findFile(path, fileName);
        }
    }

    static void findFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    searchKeyword(file,keyword);
                }
            }
        }
    }

    private static void searchKeyword(File file, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(file.getAbsolutePath() + "line " + lineNumber);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
