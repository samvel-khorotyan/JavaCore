package lesson3;

public class Conversion {

    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nприобразование типа int в тип byte. ");

        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nпереобразование типа double d nbg int.");

        i = (int) d;

        System.out.println("d и i " + d + " " + i);

        System.out.println("\nпереобразование типа double в тип byte.");

        b = (byte) d;

        System.out.println("d и b " + d + " " + b);
    }
}
