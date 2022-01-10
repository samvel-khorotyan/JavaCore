package chapter11;

public class CallMe {

    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
