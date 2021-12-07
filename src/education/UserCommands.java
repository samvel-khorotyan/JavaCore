package education;

public interface UserCommands {

    String EXIT_U = "0";
    String ADD_LESSON_U = "1";
    String ADD_STUDENT_U = "2";
    String PRINT_STUDENTS_U = "3";
    String PRINT_STUDENTS_BY_LESSON_U = "4";
    String PRINT_LESSONS_U = "5";

    static void printCommands() {
        System.out.println();
        System.out.println("please input " + EXIT_U + " for exit");
        System.out.println("please input " + ADD_LESSON_U + " for add lesson");
        System.out.println("please input " + ADD_STUDENT_U + " for add student");
        System.out.println("please input " + PRINT_STUDENTS_U + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON_U + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS_U + " for print lessons");
        System.out.println();
    }
}
