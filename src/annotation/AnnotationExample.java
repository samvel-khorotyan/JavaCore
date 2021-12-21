package annotation;

import java.lang.annotation.Annotation;

@MyAnnotation(name = "annotation")
public class AnnotationExample {


    public static void main(String[] args) {

        AnnotationExample annotationExample = new AnnotationExample();
        Annotation[] annotations = annotationExample.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
