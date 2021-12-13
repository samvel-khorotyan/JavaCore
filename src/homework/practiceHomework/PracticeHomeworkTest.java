package homework.practiceHomework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        long minutes = practiceHomework.convert(60);
        System.out.println(minutes);

        int days = practiceHomework.calcAge(1997);
        System.out.println(days);

        int number = practiceHomework.nextNumber(0);
        System.out.println(number);

        boolean trueOrFalse = practiceHomework.isSameNum(10, 10);
        System.out.println(trueOrFalse);

        boolean num = practiceHomework.lessThanOrEqualToZero(10);
        System.out.println(num);

        boolean value = practiceHomework.reverseBool(false);
        System.out.println(value);

        int[] array1 = {1, 9, 52, 74, 8, 6, 4, 222, 22, 1};
        int[] array2 = {6, 58, 2, 4, 225, 2, 22, 5, 9,};
        int maxLength = practiceHomework.maxLength(array1, array2);
        System.out.println(maxLength);
    }
}
