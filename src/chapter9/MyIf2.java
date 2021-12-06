package chapter9;

public interface MyIf2 {

    int getNumber();

    default String getString(){
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
