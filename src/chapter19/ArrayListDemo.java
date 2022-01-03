package chapter19;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Haчaльный размер списочного " + "массива a1 " + a1.size());

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");

        System.out.println("Paзмep списочного массива a1 " + "после ввода элементов:" +
                a1.size());

        System.out.println("Coдepжимoe списочного массива a1: " + a1);

        a1.remove("F");
        a1.remove(2);

        System.out.println("Paзмep списочного массива a1 " + "после удаления элементов " +
                a1.size());

        System.out.println("Coдepжимoe списочного массива al: " + a1);
    }
}
