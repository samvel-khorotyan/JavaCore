package arrayUtil;

public class ArrayUtil1 {


    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    void evens(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }


    void odds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }


    int sumEvens(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }


    int sumOdds(int[] array) {
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum1++;
            }
        }
        return sum1;
    }


    int ints(int[] array) {
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            z += array[i];
        }
        return z / array.length;
    }


    int ints1(int[] array) {
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            t += array[i];
        }
        return t;
    }

    void sorting(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
