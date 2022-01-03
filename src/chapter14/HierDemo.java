package chapter14;

public class HierDemo {

    public static void main(String[] args) {

        Gen6<String,Integer> x = new Gen6<>("Значение равно:",99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
