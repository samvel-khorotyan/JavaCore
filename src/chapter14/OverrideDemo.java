package chapter14;

public class OverrideDemo {

    public static void main(String[] args) {

        Gen11<Integer> iob = new Gen11<>(88);

        Gen11<Integer> iob2 = new Gen11<>(99);

        Gen11<String> strOb2 = new Gen11<>("Тест обобщений");

        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(strOb2.getOb());
    }
}
