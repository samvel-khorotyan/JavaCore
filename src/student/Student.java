package student;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private String surname;
    private transient int age;
    private String phoneNumber;
    private String lessonName;

    public Student() {
    }

    public Student(String name, String surname, int age, String phoneNumber, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(phoneNumber, student.phoneNumber) && Objects.equals(lessonName, student.lessonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber, lessonName);
    }

    @Override
    public String toString() {
        return "CollectoinExample.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
