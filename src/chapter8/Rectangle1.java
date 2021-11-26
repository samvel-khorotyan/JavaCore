package chapter8;

public class Rectangle1 extends Figure1 {

    Rectangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}
