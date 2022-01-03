package chapter14;

public class RawDemo {

    public static void main(String[] args) {

        Gen2<Integer> iob = new Gen2<>(88);

        Gen2<String> strOb = new Gen2<>("Tecт обобщений");

        Gen2 raw = new Gen2(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("Знaчeниe:" + d);

        strOb = raw;

        raw = iob;
    }
}
