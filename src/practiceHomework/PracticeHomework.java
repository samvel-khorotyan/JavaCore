package practiceHomework;

public class PracticeHomework {

    long convert(int minuts) {
        return minuts * 60;
    }

    int calcAge(int years) {
        if (years % 4 == 0) {
            return 366;
        }
        return 365;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThanOrEqualToZero(int number) {
       return number <= 0;
    }

    boolean reverseBool(boolean value){
        return !value;
    }

    int  maxLength(int[] array1,int[] array2){
        if (array1.length > array2.length){
            return array1.length;
        }else {
            return array2.length;
        }
    }
}
