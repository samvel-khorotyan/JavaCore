package newhomework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        System.out.println(practiceHomework.convert(10));
        System.out.println(practiceHomework.calcAge(10));
        System.out.println(practiceHomework.nextNumber(6));
        System.out.println(practiceHomework.isSameNum(7, 17));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-100));
        System.out.println(practiceHomework.reverseBool(true));
        int[] array1 = {1,2,3,4,};
        int[] array2 = {5,6,7,8,9};
        System.out.println(practiceHomework.maxLength(array1, array2));
    }
}
