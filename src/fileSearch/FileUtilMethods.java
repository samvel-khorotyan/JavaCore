package fileSearch;

import java.io.*;

public class FileUtilMethods {

    public void findLines(String txtPath, String keyword) {

        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String line;
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void printSizeOfPackage(String path) {

        File file = new File(path);

        System.out.println(file.length());
    }

    public void createFileWithContent(String path2, String filename, String content) {
        File file = new File(path2);

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

       try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
           bufferedWriter.write(content);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
