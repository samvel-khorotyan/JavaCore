package arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        int[] array1 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int b = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > b) {
                b = array1[i];
            }
        }
        System.out.print(b + " ");

        System.out.println();
        System.out.println();

        int[] array2 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int g = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < g) {
                g = array2[i];
            }
        }
        System.out.print(g + " ");

        System.out.println();
        System.out.println();

        int[] array3 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 == 0) {
                System.out.print(array3[i] + " ");
            }
        }

        System.out.println();
        System.out.println();

        int[] array4 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 1) {
                System.out.print(array4[i] + " ");
            }
        }

        System.out.println();
        System.out.println();

        int[] array5 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int d = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 == 0) {
                d++;
            }
        }
        System.out.print(d + " ");

        System.out.println();
        System.out.println();

        int[] array6 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int e = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] % 2 == 1) {
                e++;
            }
        }
        System.out.print(e + " ");

        System.out.println();
        System.out.println();

        int[] array7 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int z = 0;
        for (int i = 0; i < array7.length; i++) {
            z += array7[i];
        }
        System.out.print(z / array.length);

        System.out.println();
        System.out.println();

        int[] array8 = {12, 26, 60, 77, 41, 30, -2, 99, 10, 80};
        int t = 0;
        for (int i = 0; i < array8.length; i++) {
            t += array8[i];
        }
        System.out.print(t);
    }
}
