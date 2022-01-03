package chapter19;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(-8);
        l1.add(20);
        l1.add(-20);
        l1.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(l1, r);

        System.out.println("Cпиcoк отсортирован в обратном порядке:");

        for (Integer i : l1) {
            System.out.println(i + " ");
        }
        System.out.println();

        Collections.shuffle(l1);

        System.out.println("Cпиcoк перетасован:");

        for (Integer i : l1) {
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.println("Mинимyм: " + Collections.min(l1));
        System.out.println("Максимум: " + Collections.max(l1));
    }
}
