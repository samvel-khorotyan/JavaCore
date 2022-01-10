package chapter11;

public class Q {

    int n;

    synchronized int get() {
        System.out.println("Пoлyчeнo: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
    }
}
