package arrayExample;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array = {1, 12, 3, 99, 8, 24, 13, 7, 100, 18};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
