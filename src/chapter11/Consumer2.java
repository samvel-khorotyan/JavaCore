package chapter11;

public class Consumer2 implements Runnable {

    Q2 q;

    Consumer2(Q2 q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
