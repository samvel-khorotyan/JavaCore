package education;

import static education.StudentLessonTest.lessonStorage;

import static education.StudentLessonTest.studentStorage;

public interface StudentLessonCommands {

    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";

    static void printCommands() {
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

    static void printCommands2() {
        System.out.println();
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println();
    }

    static void chooseStudent() {
        System.out.println("please choose student");
        System.out.println("-----------------");
        studentStorage.print();
        System.out.println("-----------------");
    }

    static void chooseLesson() {
        System.out.println("please choose lesson");
        System.out.println("-----------------");
        lessonStorage.print();
        System.out.println("-----------------");
    }
}
