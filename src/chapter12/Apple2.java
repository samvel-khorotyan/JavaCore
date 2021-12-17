package chapter12;

public enum Apple2 {

    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(15), Cortland(8);

    private int price;

    Apple2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
