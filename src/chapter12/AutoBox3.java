package chapter12;

public class AutoBox3 {

    public static void main(String[] args) {

        Integer iob, iob2;
        int i;

        iob = 100;
        System.out.println("Исходное значение iOb: " + iob);
        ++iob;
        System.out.println("После ++iOb:: " + iob);

        iob2 = iob + (iob / 3);
        System.out.println("Ob2 после выражения: " + iob2);

        i = iob + (iob / 3);
        System.out.println("i после выражения: " + i);
    }
}
