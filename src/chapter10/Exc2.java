package chapter10;

public class Exc2 {

    public static void main(String[] args) {

        int d, a;

        try {
            d = 0;
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");
    }
}
