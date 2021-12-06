package chapter9;

public class Client implements CallBack{

    public void callBack(int p){
        System.out.println("Meтoд callback(), " + " вызываемый со значением " + p);
    }

    void nonIFaceMeth(){
        System.out.println("B классах, реализующих интерфейсы, " + " могут определяться и другие члены.");
    }
}
