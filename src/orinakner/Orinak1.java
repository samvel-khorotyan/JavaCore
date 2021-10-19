package orinakner;

public class Orinak1 {

    public static void main(String[] args) {


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = new char[9];
        int i, j;
        for (j = 0, i = 0; i < text.length; j++, i++) {
            if (text[i] == ' ') {
                continue;
            }
            result[j] = text[i];
            System.out.print(result[j] + " ");
        }
    }
}