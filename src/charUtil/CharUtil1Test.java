package charUtil;

public class CharUtil1Test {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] text = {' ', ' ', ' ', ' ', 'b', ' ', 'a', ' ', 'r', ' ', 'e', ' ', 'v', ' ', ' ', ' '};

        CharUtil1 charUtil1 = new CharUtil1();

        int letter;
        letter = charUtil1.letter(bolola);
        System.out.println(letter);

        charUtil1.letter1(bolola);

        boolean booleans;
        booleans = charUtil1.booleans(bolola);
        System.out.println(booleans);

        boolean lol;
        lol = charUtil1.lol(bolola);
        System.out.println(lol);

        charUtil1.shift(text);
    }
}
