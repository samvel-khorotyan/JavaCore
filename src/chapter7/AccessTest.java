package chapter7;

public class AccessTest {

    public static void main(String[] args) {

        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);
        System.out.println("a,b, и c: " + ob.a + " " + ob.b + " " + ob.getC());

    }
}
