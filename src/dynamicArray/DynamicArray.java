package dynamicArray;

public class DynamicArray {

    private int[] array;
    private int size;

    DynamicArray() {
        array = new int[10];
    }

    DynamicArray(int length) {
        array = new int[length];
    }

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid Index" + index);
        } else {
            if (size == array.length) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    public void set(int value,int index){
        if (index < 0 || index > size) {
            System.err.println("Invalid Index" + index);
        }else {
            array[index] = value;
        }
    }

    private void extend() {
        int[] array1 = new int[array.length + (array.length / 2)];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.err.println("Invalid Index " + index);
            return -1;
        } else {
            return array[index];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid Index " + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }
    }

    public boolean isEmpty(){
       return size == 0;
    }

    public boolean isExists(int value){
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }
}

