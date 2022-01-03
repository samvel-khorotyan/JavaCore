package chapter19;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {


        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println("Coдepжимoe списочного массива a1:" + a1);

        Integer[] ia = new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        for (Integer integer : ia) {
            sum += integer;
        }

        System.out.println("Cyммa: " + sum);
    }
}
