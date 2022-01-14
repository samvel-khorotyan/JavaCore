package multiThreadReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class MultiThreadReadDemo {

    public static String path ="C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\sample\\sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();

    public static void main(String[] args) throws IOException, InterruptedException {

        long count = Files.lines(Paths.get(path)).count();

        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();

        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> list = strings.subList(0, 700000);
        List<String> list1 = strings.subList(700001, 1400000);
        List<String> list2 = strings.subList(1400001, 2400000);
        List<String> list3 = strings.subList(2400000, 3448632);

        new MultiThreadRead(list,countOfKeyword).thread.join();
        new MultiThreadRead(list1,countOfKeyword).thread.join();
        new MultiThreadRead(list2,countOfKeyword).thread.join();
        new MultiThreadRead(list3,countOfKeyword).thread.join();

        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
    }
}
