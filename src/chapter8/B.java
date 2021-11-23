package chapter8;

public class B extends A {

    int k;

    public B(int i, int j ) {
        super();
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
