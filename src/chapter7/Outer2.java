package chapter7;

public class Outer2 {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}
