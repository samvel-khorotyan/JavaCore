package chapter13.file.studentExample;

import java.io.*;

public class StudentTest {

    private static final String FILE_PATH = "C:\\Users\\User\\Screenshot\\text.txt\\";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("poxos", "poxosyan", 25, "poxos@gmail.com");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student1 = (Student) object;
        System.out.println(student1);
    }
}
