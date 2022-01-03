package chapter19;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> l1 = new LinkedList<>();

        l1.add("F");
        l1.add("B");
        l1.add("D");
        l1.add("E");
        l1.add("C");
        l1.addLast("Z");
        l1.addFirst("A");

        l1.add(1, "A2");

        System.out.println("Иcxoднoe содержимое связного " + "списка l1 : " + l1);

        l1.remove("F");
        l1.remove(2);
        System.out.println("Coдepжимoe связного списка l1 " + "после удаления элементов: " + l1);

        l1.removeFirst();
        l1.removeLast();

        System.out.println("Coдepжимoe связного списка l1 " + "после удаления первого и "
                + "последнего элементов: " + " " + l1);

        String val = l1.get(2);
        l1.set(2, val + " изменено");

        System.out.println("Coдepжимoe связного списка l1 " + "после изменения: " + l1);
    }
}
