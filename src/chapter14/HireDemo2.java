package chapter14;

public class HireDemo2 {

    public static void main(String[] args) {

        Gen7<String> w = new Gen7<>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
