package collectoinExample;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private int age;
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
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email);
    }

    @Override
    public String toString() {
        return "CollectoinExample.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
// sa tariqi depqum e ashxatum
//        if (age == o.age) {
//            return 0;
//        } else if (age > o.age) {
//            return 1;
//        }
//        return -1;
// Stringi depqum grum enq ayspes
        return name.compareTo(o.name);
    }
}
