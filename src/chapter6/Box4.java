package chapter6;

public class Box4 {

    double width;
    double height;
    double depth;

    Box4(double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return  width * height * depth;
    }
}
