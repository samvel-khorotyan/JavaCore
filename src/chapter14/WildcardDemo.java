package chapter14;

public class WildcardDemo {

    public static void main(String[] args) {


        Integer[] inums = {1, 2, 3, 4, 5};
        Stats2<Integer> iob = new Stats2<>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dob = new Stats2<>(dnums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats2<Float> fob = new Stats2<>(fnums);
        double x = fob.average();
        System.out.println("Cpeднee значение fob равно " + x);

        System.out.print("Cpeдниe значения iob и dob");
        if (iob.samAvg(dob)) {
            System.out.println("paвны.");
        } else {
            System.out.println("oтличaютcя.");
        }

        System.out.print("Cpeдниe iob и fob");
        if (iob.samAvg(fob)) {
            System.out.println(" oдинaкoвы.");
        } else {
            System.out.println("oтличaютcя.");
        }
    }
}
