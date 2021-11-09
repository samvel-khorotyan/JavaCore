package chapter6;

public class BoxDemo5 {

    public static void main(String[] args) {

        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        vol = myBox1.volume();
        System.out.println("объем равен " + vol);

        vol = myBox2.volume();
        System.out.println("объем равен " + vol);

    }
}
