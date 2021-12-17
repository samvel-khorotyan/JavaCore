package chapter12;

public class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{


    public @TypeAnno Integer f2 (int j,int k){
        return j + k;
    }

    public @Recommended Integer f3(String str){
        return str.length() / 2;
    }
}
