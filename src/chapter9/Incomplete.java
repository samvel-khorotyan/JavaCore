package chapter9;

public abstract class Incomplete implements CallBack {

    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
