package chapter14;

public class Gen7<T> extends NonGen2 {

    T ob;

    Gen7(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
