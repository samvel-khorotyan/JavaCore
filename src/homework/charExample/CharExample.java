package homework.charExample;

public class CharExample {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                a++;
            }
        }
        System.out.println(a);


        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.print(bolola1[bolola1.length / 2-1] + " ");
        System.out.println(bolola1[bolola1.length / 2]);


        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char i = 'i';
        char y = 'y';
        boolean f = false;

            if (bolola2[bolola2.length - 2] == i && bolola2[bolola2.length - 1] == y) {
                f = true;
        }
        System.out.println(f);


        char[] bolola3 = {'b', 'o', 'l', 'o', 'l', 'a'};
        boolean l = false;
        for (int s = 0; s < bolola3.length-1; s++) {
            if (bolola3[s] == 'l' && bolola3[s + 2] == 'l') {
                l = true;
                break;
            }
        }
        System.out.println(l);

        char[] text = {' ', ' ', ' ', ' ', 'b', ' ', 'a', ' ', 'r', ' ', 'e', ' ', 'v', ' ', ' ', ' '};
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
