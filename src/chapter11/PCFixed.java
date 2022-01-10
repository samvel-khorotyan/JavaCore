package chapter11;

public class PCFixed {

    public static void main(String[] args) {

        Q2 q = new Q2();
        new Producer2(q);
        new Consumer2(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
