package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.util.ArrayUtil;
import homework.education.model.Student;

public class StudentStorage {

    private Student[] student = new Student[20];
    private int size;

    public void add(Student students) {
        if (size == student.length) {
            extend();
        }
        student[size++] = students;
    }

    private void extend() {
        Student[] student1 = new Student[student.length + (student.length / 2)];
        System.arraycopy(student, 0, student1, 0, student.length);
        student = student1;
    }

    public void print() {
        ArrayUtil.print(student, size);
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (student[i].getEmail().equals(email)) {
                return student[i];
            }
        }
        return null;
    }

    public void deleteStudentBYEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (student[i].getEmail().equals(email)) {
                ArrayUtil.deleteByIndex(student, i, size);
            }
        }
        size--;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            for (Lesson lesson1 : student[i].getLesson()) {
                if (lesson1.equals(lesson)) {
                    System.out.println(student[i]);
                }
            }
        }
    }
}
