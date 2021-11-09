package chapter6;

public class BoxDemo7 {

    public static void main(String[] args) {

        Box4 myBox1 = new Box4(10,20,15);
        Box4 myBox2 = new Box4(3,6,9);

        double vol;

        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
