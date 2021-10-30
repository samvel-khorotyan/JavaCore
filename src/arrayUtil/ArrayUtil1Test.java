package arrayUtil;

public class ArrayUtil1Test {

    public static void main(String[] args) {

        int[] array = {-1, 55, 24, 13, -2, 69, 40, 75, 30, 9};

        ArrayUtil1 arrayUtil1 = new ArrayUtil1();

        arrayUtil1.print(array);

        int max;
        max = arrayUtil1.max(array);
        System.out.println(max);

        int min;
        min = arrayUtil1.min(array);
        System.out.println(min);

        arrayUtil1.evens(array);

        arrayUtil1.odds(array);

        int sumEvens;
        sumEvens = arrayUtil1.sumEvens(array);
        System.out.println(sumEvens);

        int sumOdds;
        sumOdds = arrayUtil1.sumOdds(array);
        System.out.println(sumOdds);

        int ints;
        ints = arrayUtil1.ints(array);
        System.out.println(ints);

        int ints1;
        ints1 = arrayUtil1.ints1(array);
        System.out.println(ints1);

        arrayUtil1.sorting(array);
    }
}
