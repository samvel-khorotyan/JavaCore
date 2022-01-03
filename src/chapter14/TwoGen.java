package chapter14;

public class TwoGen<T, V> {

    T Ob1;
    V Ob2;

    TwoGen(T O1, V O2) {
        Ob1 = O1;
        Ob2 = O2;
    }

    void showTypes() {
        System.out.println("Tип Т: " + Ob1.getClass().getName());
        System.out.println("Tип V: " + Ob2.getClass().getName());
    }

    T getOb1() {
        return Ob1;
    }

    V getOb2() {
        return Ob2;
    }
}
