package chapter8;

public class B2 extends A2{

    int i;

    B2(int a,int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("Члeн i в суперклассе: "+ super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
