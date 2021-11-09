package chapter7;

public class OverLoadDemo1 {

    void test(){
        System.out.println("Параметры отсутствуюут");
    }

    void test(int a,int b){
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a){
        System.out.println("внутреннее преобразование при вызове" + "test(double) a:" + a);
    }
}
