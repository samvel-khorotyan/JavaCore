package orinakner;

public class Orinak1 {

    public static void main(String[] args) {


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = new char[9];
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                continue;
            }
            for (int j = 0; j < 1; j++) {
                    result[j] = text[i];
                    System.out.print(result[j] + " ");
            }
        }
    }
}
