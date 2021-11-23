package chapter8;

public class Box222Weight extends Box222 {

    double weight;

    Box222Weight(Box222Weight ob){
        super(ob);
        weight = ob.weight;
    }

    Box222Weight(double w,double h,double d,double m){
        super(w,h,d);
        weight = m;
    }

    Box222Weight(){
        super();
        weight = -1;
    }

    Box222Weight(double len,double m){
        super(len);
        weight = m;
    }
}