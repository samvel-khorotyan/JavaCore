package chapter11;

public class MultiThreadDemo3 {

    public static void main(String[] args) {

        new NewThread3("Oдин");
        new NewThread3("Два");
        new NewThread3("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
