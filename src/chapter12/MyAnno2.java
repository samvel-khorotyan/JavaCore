package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {

    String str() default "Тестирование";
    int val() default 9000;

}
