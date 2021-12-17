package chapter12;

public class EnumDemo4 {

    public static void main(String[] args) {

        Apple4 ap, ap2, ap3;

        System.out.println("Bce константы сортов яблок " + " их порядковые значения:");
        for (Apple4 a : Apple4.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple4.RedDel;
        ap2 = Apple4.GoldenDel;
        ap3 = Apple4.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " редшествуе " + ap2);
        }

        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " предшествует " + ap);
        }

        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " равно " + ap3);
        }

        System.out.println();

//        if (ap.compareTo(ap2)){
//            System.out.println("Oшибкa!");
//        }

        if (ap.equals(ap3)) {
            System.out.println(ap + " равно " + ap3);
        }

        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
