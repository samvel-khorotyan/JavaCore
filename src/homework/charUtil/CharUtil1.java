package homework.charUtil;

public class CharUtil1 {

    int letter(char[] bolola) {
        char c = 'o';
        int a = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                a++;
            }
        }
        return a;
    }

    void letter1(char[] bolola) {
        System.out.print(bolola[bolola.length / 2 - 1] + " ");
        System.out.println(bolola[bolola.length / 2]);
    }

    boolean booleans(char[] bolola) {
        char i = 'i';
        char y = 'y';
        boolean f = false;

        if (bolola[bolola.length - 2] == i && bolola[bolola.length - 1] == y) {
            f = true;
        }
        return f;
    }

    boolean lol(char[] bolola) {
        boolean l = false;
        for (int s = 0; s < bolola.length - 1; s++) {
            if (bolola[s] == 'l' && bolola[s + 2] == 'l') {
                l = true;
                break;
            }
        }
        return l;
    }

    void shift(char[] text) {
        int a1 = 0;
        int a2 = text.length - 1;
        while (text[a1] == ' ') {
            a1++;
        }
        while (text[a2] == ' ') {
            a2--;
        }
        char[] result = new char[(a2 - a1) + 1];
        int x = 0;
        for (int j = a1; j < a2 + 1; j++) {
            result[x++] = text[j];
        }
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j]);
        }
    }
}
