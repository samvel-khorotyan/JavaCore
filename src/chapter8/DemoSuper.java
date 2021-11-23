package chapter8;

public class DemoSuper {

    public static void main(String[] args) {

        Box1Weight myBox1 = new Box1Weight(10,20,15,34.3);
        Box1Weight myBox2 = new Box1Weight(2,3,4,0.076);
        Box1Weight myBox3 = new Box1Weight();
        Box1Weight myCube = new Box1Weight(2,3);
        Box1Weight myClone = new Box1Weight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Вес myclone равен " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + myCube.weight);
        System.out.println();

    }
}
