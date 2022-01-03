package collectoinExample;

import java.util.Map;
import java.util.TreeMap;

class example {

    public static void main(String[] args) {

//        Map<String, CollectoinExample.Student> studentMap = new HashMap<>();
//
//        CollectoinExample.Student student = new CollectoinExample.Student("poxos","poxosyan",88,"poxos@gmail.com");
//
//        studentMap.put("khorotyan@gmail.com",student);
//
//        CollectoinExample.Student student1 = studentMap.get("khorotyan@gmail.com");
//
//        System.out.println(student1);

        Map<String,Integer> map = new TreeMap<>();

        map.put("shnik@mail.com",20);
        map.put("poxos@gmail.com",30);
        map.put("aharon@gmail.com",40);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
