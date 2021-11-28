package education;

import java.util.Scanner;

public class StudentLessonTest {

    static LessonStorage lessonStorage = new LessonStorage();

    static StudentStorage studentStorage = new StudentStorage();

    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {

            printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addlesson();
                    break;
                case ADD_STUDENT:
                    addstudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println();
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please input student email");
        String email = scanner.nextLine();

        Student student = studentStorage.grtByEmail(email);

        if (student != null) {
            studentStorage.deleteStudentBYEmail(student);
            System.out.println();
            System.out.println("student data deleted");
        } else {
            System.out.println();
            System.out.println("There is no student by this email");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();

        Lesson lesson = lessonStorage.getByName(name);

        if (lesson != null) {
            lessonStorage.deleteLessonByName(name);
            System.out.println();
            System.out.println("The course with that name has been deleted");
        } else {
            System.out.println();
            System.err.println("There is no course by that name");
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("Please enter the name of the student course");
        String lesson = scanner.nextLine();

        Student student = studentStorage.getByLesson(lesson);

        if (student != null) {
            studentStorage.getStudentLesson(lesson);
        } else {
            System.out.println();
            System.out.println("There is no course with that name");
        }
    }

    private static void addstudent() {
        System.out.println("please input student email");
        String email = scanner.nextLine();

        Student student = studentStorage.grtByEmail(email);

        if (student == null) {
            System.out.println("please input student name");
            String name = scanner.nextLine();
            System.out.println("please input student surname");
            String surname = scanner.nextLine();
            System.out.println("please input student age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input student phone");
            String phone = scanner.nextLine();
            System.out.println("please input student lesson");
            String lesson = scanner.nextLine();

            Student student1 = new Student(name, surname, age, email, phone, lesson);

            studentStorage.add(student1);

            System.out.println();
            System.out.println("thanks student data added");
        } else {
            System.out.println();
            System.err.println("There was already a student by that email");
        }
    }

    private static void addlesson() {
        System.out.println("Please enter a course name");
        String name = scanner.nextLine();

        Lesson lesson = lessonStorage.getByName(name);

        if (lesson == null) {
            System.out.println("Please enter the course length");
            String duration = scanner.nextLine();
            System.out.println("Please enter the name of the lecturer");
            String lecturerName = scanner.nextLine();
            System.out.println("Please enter the price of the course");
            int price = Integer.parseInt(scanner.nextLine());

            Lesson lesson1 = new Lesson(name, duration, lecturerName, price);

            lessonStorage.add(lesson1);

            System.out.println();
            System.out.println("Thanks, the course has been added");
        } else {
            System.out.println();
            System.err.println("There was already a course with that name");
        }
    }

    private static void printCommands() {
        System.out.println();
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email");
        System.out.println();
    }
}
