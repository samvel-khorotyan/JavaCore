package homework.scannerExample;

import homework.calculator.Calculator;

import java.util.Scanner;

public class ScannerExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true){
            System.out.println("please input (+,-,*,/) or for exit");
            String oeration = scanner.next();
            if (oeration.equals("0")){
                break;
            }
            if (!oeration.equals("+") && !oeration.equals("-") && !oeration.equals("*") && !oeration.equals("/")){
                System.out.println("invalid operation");
            }else {
                System.out.println("please input a");
                int a = scanner.nextInt();
                System.out.println("please input b");
                int b = scanner.nextInt();
                switch (oeration){
                    case "+":
                        System.out.println(calc.plus(a, b));
                        break;
                    case "-":
                        System.out.println(calc.minus(a, b));
                        break;
                    case "*":
                        System.out.println(calc.multiply(a, b));
                        break;
                    case "/":
                        System.out.println(calc.divide(a, b));
                        break;
                }
            }
        }
    }
}
