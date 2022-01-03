package chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        System.out.print("Исходное содержимое списочного массива a1: ");

        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        ListIterator<String> lItr = a1.listIterator();
        while (lItr.hasNext()) {
            String element = lItr.next();
            lItr.set(element + " +");
        }

        System.out.print("Исходное содержимое списочного массива a1: ");

        itr = a1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("Измeнeнный в обратном порядке список: ");
        while (lItr.hasPrevious()) {
            String element = lItr.previous();
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
