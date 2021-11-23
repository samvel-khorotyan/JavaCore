package chapter8;

public class Box1Weight extends Box1{

    double weight;

    Box1Weight(Box1Weight ob){
        super(ob);
        weight = ob.weight;
    }

    Box1Weight(double w,double h,double d,double m){
        super(w,h,d);
        weight = m;
    }

    Box1Weight(){
        super();
        weight = -1;
    }

    Box1Weight(double len,double m){
        super(len);
        weight = m;
    }
}
