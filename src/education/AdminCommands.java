package education;

public interface AdminCommands {

    String EXIT_A = "0";
    String ADD_LESSON_A = "1";
    String ADD_STUDENT_A = "2";
    String PRINT_STUDENTS_A = "3";
    String PRINT_STUDENTS_BY_LESSON_A = "4";
    String PRINT_LESSONS_A = "5";
    String DELETE_LESSON_BY_NAME_A = "6";
    String DELETE_STUDENT_BY_EMAIL_A = "7";

    static void printCommands() {
        System.out.println();
        System.out.println("please input " + EXIT_A + " for exit");
        System.out.println("please input " + ADD_LESSON_A + " for add lesson");
        System.out.println("please input " + ADD_STUDENT_A + " for add student");
        System.out.println("please input " + PRINT_STUDENTS_A + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON_A + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS_A + " for print lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME_A + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL_A + " for delete student by email");
        System.out.println();
    }
}
