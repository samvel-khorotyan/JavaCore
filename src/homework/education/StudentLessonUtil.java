package homework.education;

import static homework.education.UserStudentLessonTest.lessonStorage;
import static homework.education.UserStudentLessonTest.studentStorage;

public interface StudentLessonUtil {

    static void chooseStudent() {
        System.out.println("please choose homework.student");
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
