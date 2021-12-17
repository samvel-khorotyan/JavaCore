package chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Аннотация тестового метода")
@MyAnno(str = "Testing", val = 100)
public class Meta3 {

    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth() :");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {

        myMeth();
    }
}
