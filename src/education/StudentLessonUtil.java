package education;

import static education.StudentLessonTest.lessonStorage;

import static education.StudentLessonTest.studentStorage;

public interface StudentLessonUtil {

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
