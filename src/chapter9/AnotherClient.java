package chapter9;

public class AnotherClient implements CallBack{

    public void callBack(int p){
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
