package newAuthor.util;

import newAuthor.model.Author;
import newAuthor.model.Book;
import newAuthor.model.User;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {

    private static final String DATA_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\newAuthor\\data";

    public static void serializeAuthors(List<Author> authorsList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\authors.dat"))) {
            out.writeObject(authorsList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeBooks(List<Book> booksList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\books.dat"))) {
            out.writeObject(booksList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }


    public static void serializeUserMap(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\Users.dat"))) {
            out.writeObject(userMap);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<Author> DeSerializeAuthors() {
        File authorFile = new File(DATA_PATH + "\\authors.dat");
        if (!authorFile.exists()) {
            try {
                authorFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(authorFile))) {
                Object obj = inputStream.readObject();
                return (List<Author>) obj;
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Book> DeSerializeBooks() {
        File bookFile = new File(DATA_PATH + "\\books.dat");
        if (!bookFile.exists()) {
            try {
                bookFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(bookFile))) {
                return (List<Book>) inputStream.readObject();
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Map<String, User> DeSerializeUserMap() {
        File userFile = new File(DATA_PATH + "\\Users.dat");
        if (!userFile.exists()) {
            try {
                userFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(userFile))) {
                Object obj = inputStream.readObject();
                return (Map<String, User>) obj;
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
