package homework.braceChecker;

public class Stack {

    private char[] stack = new char[10];
    private int index = -1;

    public void push(char item) {
        if (index == stack.length - 1) {
            char[] array = new char[stack.length + (stack.length / 2)];
            for (int i = 0; i < stack.length; i++) {
                array[i] = stack[i];
            }
            stack = array;
        }
        stack[++index] = item;
    }

    public char pop() {
        if (index < 0) {
//            System.err.println("stack is empty");
            return ' ';
        } else {
            return stack[index--];
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
