package charUtil;

public class CharUtil {

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
        System.out.print(bolola1[bolola1.length / 2] + " ");
        System.out.println(bolola1[bolola1.length / 2 + 1]);


        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char i = 'i';
        char y = 'y';
        boolean f = false;
        for (int j = 0; j < bolola2.length; j++) {
            if (bolola2[bolola2.length-2]==i & bolola2[bolola2.length-1]==y){
                f = true;
            }
        }
        System.out.println(f);


        char[] bolola3 = {'l', 'o', 'b', 'o', 'b', 'a'};
        boolean l = false;
        for (int m = 0; m < bolola3.length; m++) {
            if (bolola3[2] == 'b' & bolola3[3] == 'o' & bolola3[4] == 'b')
                l = true;
        }
        System.out.println(l);


        char[] text={' ',' ','b','a','r','e','v',' ',' '};
        char[] result = new char[5];
        int p,j;
        for (j=0, p = 0; p < text.length; p++) {
            if (text[p]==' '){
                continue;
            }
            result[j]=text[p];
            System.out.print(result[j]);
            j++;
        }
    }
}
