package newhomework;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 1000; i++) {
            dynamicArray.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            dynamicArray.print();
        }
    }
}
