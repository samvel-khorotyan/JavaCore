package chapter14;

public class HierDemo3 {

    public static void main(String[] args) {

        Gen9<Integer> iob = new Gen9<>(88);

        Gen9<Integer> iob2 = new Gen9<>(99);

        Gen9<String> strOb2 = new Gen9<>("Tecт обобщений");

        if (iob2 instanceof Gen9<?>){
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen2");
        }

        if (iob2 instanceof Gen9<?>){
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen");
        }
        System.out.println();

        if (strOb2 instanceof Gen9){
            System.out.println("Oбъeкт strOb2 является " + "экземпляром класса Gen");
        }
        System.out.println();

        if (iob instanceof Gen9<?>){
            System.out.println("Oбъeкт iOb является " + "экземпляром класса Gen2");
        }

        if (iob instanceof Gen9<?>){
            System.out.println("Oбъeкт iOb является " + "экземпляром класса Gen");
        }
    }
}
