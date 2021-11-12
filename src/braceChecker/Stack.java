package braceChecker;

public class Stack {

    int[] stack = new int[10];
    int index = -1;

    void push(int item) {
        if (index == stack.length-1) {
           extend();
        }
            stack[++index] = item;
    }

    private void extend() {
        int[] array1 = new int[stack.length + (stack.length / 2)];
        for (int i = 0; i < stack.length; i++) {
            array1[i] = stack[i];
        }
        stack = array1;
    }

    int pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return stack[index--];
        }
    }
}
