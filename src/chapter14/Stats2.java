package chapter14;

public class Stats2<T extends Number> {

    T[] nums;

    Stats2(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean samAvg(Stats2<?> ob){
        if (average() == ob.average()){
            return true;
        }
        return false;
    }

}
