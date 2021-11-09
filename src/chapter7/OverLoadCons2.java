package chapter7;

public class OverLoadCons2 {

    public static void main(String[] args) {

        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);

        Box1 myClone = new Box1(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);

        vol = myCube.volume();
        System.out.println("Объем куба равен " + vol);

        vol = myClone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}
