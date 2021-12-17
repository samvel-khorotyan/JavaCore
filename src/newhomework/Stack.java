package newhomework;

public class Stack {

    private int[] stack = new int[10];
    private int index = -1;

    public void push(int item) {
        if (index == stack.length - 1) {
            extend();
        }
        stack[++index] = item;
    }

    private void extend() {
        int[] array = new int[stack.length + (stack.length / 2)];
        for (int i = 0; i < stack.length; i++) {
            array[i] = stack[i];
        }
        stack = array;
    }

    public int pop() {
        if (index < 0) {
            System.err.println("stack is empty");
            return -1;
        } else {
            return stack[index--];
        }
    }
}
