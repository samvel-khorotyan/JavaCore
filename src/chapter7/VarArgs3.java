package chapter7;

public class VarArgs3 {

    static void vaTest(int... v) {

        System.out.print("vaтest(int ... ) ." + "Количество аргументов:" + v.length + " одержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... ) " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaтest(String, int ... ) : " + msg + v.length + " одержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}
