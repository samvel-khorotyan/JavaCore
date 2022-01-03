package chapter19;

import java.util.ArrayList;

public class ForEachDemo {

    public static void main(String[] args) {

        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("Исходное содержимое списочного массива vals: ");

        for (Integer val : vals) {
            System.out.print(val + " ");
        }
        System.out.println();

        int sum = 0;

        for (Integer val : vals) {
            sum += val;
        }

        System.out.println("Cyммa числовых значений: " + sum);
    }
}
