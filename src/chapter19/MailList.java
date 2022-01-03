package chapter19;

import java.util.LinkedList;

public class MailList {

    public static void main(String[] args) {

        LinkedList<Address> m1 = new LinkedList<>();

        m1.add(new Address("J.W West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome",
                "IL", "61853"));
        m1.add(new Address("Tom Carlton", "867 Elm St", "Champaign",
                "IL", "61820"));

        for (Address address : m1) {
            System.out.println(address + "\n");
        }
        System.out.println();
    }
}
