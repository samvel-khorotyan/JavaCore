package homework.arrayUtil;

public class ArrayUtil1Test {

    public static void main(String[] args) {

        int[] array = {-1, 55, 24, 13, -2, 69, 40, 75, 30, 9};

        ArrayUtil1.print(array);

        int max;
        max = ArrayUtil1.max(array);
        System.out.println(max);

        int min;
        min = ArrayUtil1.min(array);
        System.out.println(min);

        ArrayUtil1.evens(array);

        ArrayUtil1.odds(array);

        int sumEvens;
        sumEvens = ArrayUtil1.sumEvens(array);
        System.out.println(sumEvens);

        int sumOdds;
        sumOdds = ArrayUtil1.sumOdds(array);
        System.out.println(sumOdds);

        int ints;
        ints = ArrayUtil1.ints(array);
        System.out.println(ints);

        int ints1;
        ints1 = ArrayUtil1.ints1(array);
        System.out.println(ints1);

        ArrayUtil1.sorting(array);
    }
}
