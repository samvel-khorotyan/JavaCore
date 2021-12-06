package chapter9;

public interface IntStack1 {

    void push(int item);
    int pop();

    default void clear(){
        System.out.println("Meтoд clear() не реализован.");
    }

}
