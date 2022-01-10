package chapter11;

public class Caller2 implements Runnable {

    String msg;
    CallMe2 target;
    Thread t;

    public Caller2(CallMe2 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
