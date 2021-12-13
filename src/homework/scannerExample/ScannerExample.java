package homework.scannerExample;

import homework.calculator.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("pliase input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();

        boolean isWrongCommand;
        do {
            isWrongCommand = false;
            System.out.println("please input (+,-,*,/)");
            String operation = scanner.next();
            switch (operation) {
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
                default:
                    isWrongCommand = true;
                    System.out.println("տվյալ գօրծողուտյունը առկա չէ");
            }
        } while (isWrongCommand);
    }
}
