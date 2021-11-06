package dynamicArray;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class DynamicArray {


    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        array[size++] = value;
        if (size == array.length) {
            extend();
        }
    }

    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("տվյալ index-ը մասիվի սահմաններից դուրս է");
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
