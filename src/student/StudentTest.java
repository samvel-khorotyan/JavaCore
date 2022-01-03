package student;

import java.io.*;
import java.util.Scanner;

public class StudentTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student student = new Student("Poxos", "Poxosyan", 23, "098778878", "Java");

        System.out.println("please input FILE_PATE");
        String FILE_PATH = scanner.nextLine();

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object object = objectInputStream.readObject();
            Student student1 = (Student) object;
            if (student1.getLessonName().equals("Java")) {
                System.out.println(student1);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}