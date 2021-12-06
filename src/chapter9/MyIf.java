package chapter9;

public interface MyIf {

    int getNumber();

    default String getString(){
        return "Объект типа String по умолчанию";
    }
}
