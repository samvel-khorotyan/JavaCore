package chapter12;

import java.lang.reflect.Method;

public class Meta2 {

    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta2 ob = new Meta2();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {

        myMeth("Tecт", 10);
    }
}
