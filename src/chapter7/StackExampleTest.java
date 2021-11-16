package chapter7;

public class StackExampleTest {

    public static void main(String[] args) {

        StackExample myStack1 = new StackExample(5);
        StackExample myStack2 = new StackExample(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Cтeк в mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
