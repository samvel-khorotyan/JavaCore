package education;

public class LessonStorage {

    private Lesson[] lesson = new Lesson[20];
    private int size;

    public void add(Lesson lessons) {
        if (size == lesson.length) {
            extend();
        }
        lesson[size++] = lessons;
    }

    private void extend() {
        Lesson[] lesson1 = new Lesson[lesson.length + (lesson.length / 2)];
        System.arraycopy(lesson, 0, lesson1, 0, lesson.length);
        lesson = lesson1;
    }

    public void print() {
        ArrayUtil.print(lesson, size);
    }


    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lesson[i].getName().equals(name)) {
                return lesson[i];
            }
        }
        return null;
    }

    public void deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lesson[i].getName().equals(name)) {
                ArrayUtil.deleteByIndex(lesson, i, size);
                size--;
            }
        }
    }
}
