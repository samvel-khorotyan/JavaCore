package chapter8;

public class Box222 {

    private double width;
    private double height;
    private double depth;

  Box222(Box222 ob){
      width = ob.width;
      height = ob.height;
      depth = ob.depth;
  }

  Box222(double w,double h,double d){
      width = w;
      height = h;
      depth = d;
  }

  Box222(){
      width = -1;
      height = -1;
      depth = -1;
  }

  Box222(double len){
      width = height = depth = len;
  }

  double volume(){
      return width * height * depth;
  }


}
