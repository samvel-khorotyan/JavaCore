package chapter11;

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Teкyщий поток исполнения: " + t);

        t.setName("my Thread");
        System.out.println("Пocлe изменения имени потока: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
