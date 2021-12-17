package chapter12;

public enum Apple3 {

    Jonathan(10), GoldenDel(9), RedDel,
    Winesap(15), Cortland(8);

    private int price;

    Apple3(int p) {
        price = p;
    }

    Apple3() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
