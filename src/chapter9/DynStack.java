package chapter9;

public class DynStack implements IntStack {

    private int stack[];
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] stack1 = new int[stack.length + (stack.length / 2)];
            System.arraycopy(stack, 0, stack1, 0, stack.length);
            stack = stack1;
            stack[++tos] = item;
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
