package chapter8;

public class AbstractAreas1 {

    public static void main(String[] args) {

//      Figure1 figure1 = new Figure1(10,10); abstract
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);
        Figure1 figref;

        figref = r;
        System.out.println("Плoщaдь равна " + figref.area());

        figref = t;
        System.out.println("Плoщaдь равна " + figref.area());
    }
}
