package dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 5; i <= 5; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.delete(8);

        dynamicArray.print();

        int[] numbers = {33, 44, 55};
        dynamicArray.add(numbers);

        dynamicArray.add(24, 2);

        dynamicArray.set(36, 2);

        System.out.println(dynamicArray.isEmpty());

        dynamicArray.print();

        System.out.println(dynamicArray.isExists(36));

    }
}