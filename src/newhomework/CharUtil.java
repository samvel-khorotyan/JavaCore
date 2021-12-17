package newhomework;

public class CharUtil {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c = 'o';
        int sum = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                sum++;
            }
        }
        System.out.println(sum);

        System.out.print(bolola[bolola.length / 2 - 1] + " ");
        System.out.println(bolola[bolola.length / 2]);

        boolean b = false;
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            b = true;
        }
        System.out.println(b);

        boolean booleans = false;
        for (int i = 0; i < bolola.length - 1; i++) {
            if (bolola[i] == 'l' && bolola[i + 2] == 'l') {
                booleans = true;
                break;
            }
        }
        System.out.println(booleans);

        char[] text = {' ', ' ', ' ', 'b', 'o', ' ', 'l', ' ', 'o', ' ', 'l', 'a', ' ', ' ', ' '};

        int first = 0;
        int last = text.length - 1;

        while (text[first] == ' ') {
            first++;
        }
        while (text[last] == ' ') {
            last--;
        }
        char[] result = new char[last - first + 1];
        int x = 0;
        for (int i = first; i < last + 1; i++) {
            result[x++] = text[i];
        }
        for (char c1 : result) {
            System.out.print(c1);
        }
    }
}
