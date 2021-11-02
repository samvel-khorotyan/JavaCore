package lesson6;

public class BoxDemo6 {

    public static void main(String[] args) {

        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        double vol;

        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
