package homework.newhomework;

public class StackTast {

    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 1; i <= 1000; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(stack.pop());
        }
    }
}
