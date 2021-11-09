package dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 17; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();

        System.out.println(dynamicArray.getByIndex(10));
    }
}
