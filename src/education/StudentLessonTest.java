package education;

import education.model.Lesson;

import education.model.Student;

import education.model.User;

import education.storage.LessonStorage;

import education.storage.StudentStorage;

import education.storage.UserStorage;

import education.util.DateUtil;

import java.text.ParseException;

import java.util.Date;

import java.util.Scanner;

public class StudentLessonTest implements StudentLessonCommands, UserCommands {

    static UserStorage userStorage = new UserStorage();

    static LessonStorage lessonStorage = new LessonStorage();

    static StudentStorage studentStorage = new StudentStorage();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;

        while (isRun) {

            UserCommands.printUserCommands();

            String userCommands = scanner.nextLine();

            switch (userCommands) {
                case EXIT_0:
                    isRun = false;
                    break;
                case LOGIN_1:
                    login();
                    break;
                case REGISTER_2:
                    register();
                    break;
            }
        }
    }

    private static void register() {
        System.out.println("please input user email");
        String email = scanner.nextLine();
        if (userStorage.getByEmail(email) == null) {
            System.out.println("please input user name");
            String name = scanner.nextLine();
            System.out.println("please input user surname");
            String surname = scanner.nextLine();
            System.out.println("please input user password");
            String password = scanner.nextLine();
            System.out.println("please input user type");
            String type = scanner.nextLine();

            User user = new User(name, surname, email, password, type);

            userStorage.add(user);

            System.out.println();
            System.out.println("thank you,user added");
        } else {
            System.out.println();
            System.out.println("There is already a user with this email");
        }
    }

    private static void login() throws ParseException {
        System.out.println("please input email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        System.out.println("please input password");
        String password = scanner.nextLine();
        User user1 = userStorage.getByPassword(password);
        if (user != null && user1 != null) {
            System.out.println("please input type");
            String type = scanner.nextLine();
            if (user.getType().equals(type)) {
                userSwitch();
            } else {
                adminSwitch();
            }
        } else {
            System.out.println();
            System.err.println("This user is not available");
        }
    }

    private static void adminSwitch() throws ParseException {

        boolean isRun = true;

        while (isRun) {

            StudentLessonCommands.printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
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

    private static void userSwitch() throws ParseException {

        boolean isRun = true;

        while (isRun) {

            StudentLessonCommands.printCommands2();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
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
                default:
                    System.out.println();
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void deleteStudentByEmail() {
        StudentLessonCommands.chooseStudent();
        System.out.println("please input student email");
        String email = scanner.nextLine();

        if (studentStorage.getByEmail(email) != null) {
            studentStorage.deleteStudentBYEmail(email);
            System.out.println();
            System.out.println("student data deleted");
        } else {
            System.out.println();
            System.out.println("There is no student by this email");
        }
    }

    private static void deleteLessonByName() {
        StudentLessonCommands.chooseLesson();
        System.out.println("please input lesson name");
        String name = scanner.nextLine();

        if (lessonStorage.getByName(name) != null) {
            lessonStorage.deleteLessonByName(name);
            System.out.println();
            System.out.println("The course with that name has been deleted");
        } else {
            System.out.println();
            System.err.println("There is no course by that name");
        }
    }

    private static void printStudentsByLesson() {
        StudentLessonCommands.chooseLesson();
        System.out.println("Please enter the name of the student course");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            studentStorage.printStudentsByLesson(lesson);

            System.out.println();
            System.out.println("are the students participating in the course");
        } else {
            System.out.println();
            System.out.println("This course is not available");
        }
    }

    private static void addStudent() throws ParseException {
        System.out.println("please input student email");
        String email = scanner.nextLine();
        if (studentStorage.getByEmail(email) == null) {
            System.out.println("please input student name");
            String name = scanner.nextLine();
            System.out.println("please input student surname");
            String surName = scanner.nextLine();
            System.out.println("please input student age");
            Date age = DateUtil.stringToDate(scanner.nextLine());
            System.out.println("please input student phoneNumber");
            String phoneNumber = scanner.nextLine();
            System.out.println("please choose lessonName");
            System.out.println("_______________");
            lessonStorage.print();
            System.out.println("_______________");
            System.out.println("please input lessonNames");
            String lessonName = scanner.nextLine();
            String[] strings = lessonName.split(",");
            Lesson[] lessons = new Lesson[strings.length];
            for (int i = 0; i < strings.length; i++) {
                if (lessonStorage.getByName(strings[i]) != null) {
                    lessons[i] = lessonStorage.getByName(strings[i]);
                } else {
                    System.out.println();
                    System.out.println("This course is not available");
                }
            }

            Student student = new Student(name, surName, age, email, phoneNumber, lessons);

            studentStorage.add(student);

            System.out.println();
            System.out.println("student added");
        } else {
            System.out.println();
            System.out.println("There is already a student by this email");
        }
    }

    private static void addLesson() {
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
}
