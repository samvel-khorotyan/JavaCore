package chapter14;

public class NonGenDemo {

    public static void main(String[] args) {

        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("нaчeниe: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Tecт без обобщений");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb(); // Ошибка во время выполнения!
    }
}
