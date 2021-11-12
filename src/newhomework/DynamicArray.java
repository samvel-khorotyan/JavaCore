package newhomework;

public class DynamicArray {

    private int [] array = new int[10];
    private int size = 0;

    public void add(int value){
        if (size == array.length){
            extend();
        }
        array[size++] = value;
    }

    private void extend(){
        int[] array1 = new int[array.length + (array.length / 2)];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public int getByIndex(int index){
        if (size < 0 || size > array.length){
            System.err.println("Invalid Index");
            return -1;
        }else {
            return array[index];
        }
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
