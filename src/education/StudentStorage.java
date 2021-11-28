package education;

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

    public Student grtByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (student[i].getEmail().equals(email)) {
                return student[i];
            }
        }
        return null;
    }

    public void getStudentLesson(String lesson) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (student[i].getLesson().equals(lesson)) {
                System.out.println(student[i]);
            }
        }
    }

    public void deleteStudentBYEmail(Student students) {
        for (int i = 0; i < size; i++) {
            if (student[i].equals(students)) {
                ArrayUtil.deleteByIndex(student, i, size);
                size--;
            }
        }
    }

    public Student getByLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (student[i].getLesson().equals(lesson)) {
                return student[i];
            }
        }
        return null;
    }
}
