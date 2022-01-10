package chapter11;

public class CallMe2 {

    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
        System.out.println("]");
    }
}
