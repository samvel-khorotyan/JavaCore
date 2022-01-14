package multiThreadReadFile;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static multiThreadReadFile.MultiThreadReadDemo.countOfKeyword;

class MultiThreadRead implements Runnable {


    Thread thread;
    List<String> strings;
    AtomicInteger countKeyword;

    MultiThreadRead(List<String> strings, AtomicInteger countKeyword) {
        this.countKeyword = countKeyword;
        this.strings = strings;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        String keyword = ";";
        for (String string : strings) {
            if (string.contains(keyword)) {
                countOfKeyword.incrementAndGet();
            }
        }
    }

}

