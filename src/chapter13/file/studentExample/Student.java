package chapter13.file.studentExample;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private String name;
    private String surname;
    private transient int age;
    private String email;

    public Student() {
    }

    public Student(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student example = (Student) o;
        return age == example.age && Objects.equals(name, example.name) && Objects.equals(surname, example.surname) && Objects.equals(email, example.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email);
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
