package collectoinExample;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

//  ԱՅՍՏԵՂ 2 ՆՈՒՅՆ ՕԲՅԵԿՏ ՉԵՆՔ ԿԱՐՈՂ ԳՑԵԼ,2 ՆՈՒՅ ՕԲՅԵԿՏԸ ՓՈՐՁՈՆՔ ԳՑԵԼ ԿԳՐԻ ԱՌԱՋԻՆԻ ՎՐԱ և ԱՌԱՋԻՆԸ ԿՋՆՋՎԻ
//        Set<CollectoinExample.Student> studentSet = new TreeSet<>();
//
//        CollectoinExample.Student student = new CollectoinExample.Student("aharon", "poxosyan", 18, "poxos@gmail.com");
//        CollectoinExample.Student student1 = new CollectoinExample.Student("petros", "petrosyan", 33, "petros@gmail.com");
//
//        studentSet.add(student);
//        studentSet.add(student1);
//
//        for (CollectoinExample.Student student2 : studentSet) {
//            System.out.println(student2);
//        }

// ԻՍԿ ԱՅՍ ՏԱՐԲԵՐԱԿՈՒՄ ԻՆՉՔԱՆ ՈՒԶԵՆՔ ՀԱՐՈՂ ԵՆՔ ՆՈՒՅ ՕԲՅԵԿՏԻՑ ԳՑԵԼ
        List<Student> studentList = new ArrayList<>();


        Student student = new Student("petros", "petrosyan", 33, "petros@gmail.com");
        Student student1 = new Student("petros", "petrosyan", 33, "petros@gmail.com");
        Student student2 = new Student("aharon", "poxosyan", 18, "poxos@gmail.com");

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        Collections.sort(studentList);

        for (Student student3 : studentList) {
            System.out.println(student3);
        }
    }
}
