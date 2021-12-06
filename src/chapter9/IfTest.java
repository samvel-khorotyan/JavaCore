package chapter9;

public class IfTest {

    public static void main(String[] args) {

        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Cтeк в myStack1:");

        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Cтeк в myStack2");

        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }


    }
}
