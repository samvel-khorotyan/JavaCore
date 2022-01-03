package chapter14;

public class Gen6<T, V> extends Gen5 {

    V ob2;

    Gen6(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}
