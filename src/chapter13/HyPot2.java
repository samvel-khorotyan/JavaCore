package chapter13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class HyPot2 {

    public static void main(String[] args) {
        double side1, side2;
        double hyPot;
        side1 = 3.0;
        side2 = 4.0;


        hyPot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Пpи заданной длине сторон " + side1 + " и " + side2 + " гипотенуза равна " + hyPot);


    }
}