package chapter14;

public class Gen10<T> {
    T ob;

    Gen10(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Meтoд getob() из класса Gen:");
        return ob;
    }
}
