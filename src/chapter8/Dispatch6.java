package chapter8;

public class Dispatch6 {

    public static void main(String[] args) {

       A6 a6 = new A6();
       B6 b6 = new B6();
       C6 c6 = new C6();

        A6 r;

        r = a6;
        r.callme();

        r = b6;
        r.callme();

        r = c6;
        r.callme();
    }
}
