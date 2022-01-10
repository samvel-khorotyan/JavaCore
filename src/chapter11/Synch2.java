package chapter11;

public class Synch2 {

    public static void main(String[] args) {

        CallMe2 target = new CallMe2();
        Caller2 ob1 = new Caller2(target, "Добро пожаловать");
        Caller2 ob2 = new Caller2(target, "в синхронизированный");
        Caller2 ob3 = new Caller2(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
    }
}
