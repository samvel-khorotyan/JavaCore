package homework;

public class PracticeHomework {

    long convert(int minuts) {
        return minuts * 60;
    }

    int calcAge(int years) {
        int days = 365;
        if (years % 4 == 0) {
            days = 366;
        }
        return days;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        boolean trueOrFalse = false;
        if (a == b) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }

    boolean lessThanOrEqualToZero(int number) {
        boolean b = false;
        if (number <= 0) {
            b = true;
        }
        return b;
    }

    boolean reverseBool(boolean value){
        if (value = !true);
        return value;
    }

    int  maxLength(int[] array1,int[] array2){
        if (array1.length > array2.length){
            return array1.length;
        }else {
            return array2.length;
        }
    }
}
