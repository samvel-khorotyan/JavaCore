package chapter14;

public class Gen11<T> extends Gen10<T> {

    Gen11(T o) {
        super(o);
    }

    T getOb() {
        System.out.print("Meтoд getob() из класса Gen2:");
        return ob;
    }
}
