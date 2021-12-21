package fileSearch;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {

    private static final String FILE_PATH = "C:\\Users\\User\\Screenshot\\text.txt\\";

    static Scanner scanner = new Scanner(System.in);

    static File file = new File(FILE_PATH);

    public static void main(String[] args) {

        read();
    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
            System.out.println("PLEASE INPUT KEYWORD");
            String name = scanner.nextLine();
            String line;
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(name)) {
                    System.out.println(file.getName());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
